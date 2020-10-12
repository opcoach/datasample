package com.opcoach.datasample.template.generator

import com.opcoach.datasample.util.ClassifierComparator
import com.opcoach.datasample.util.DataSampleUtil
import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage

/** this class generate a template from an EPackage */
class DataSampleTemplateGenerator {

	// THe list of classes in the package, sorted from the less relations to others, to the max relations to others 
	// last element of this list is the root class
	List<EClassifier> sortedClasses

	def generateSample(EPackage p) {
		p.generateSample(p.rootClass)
	}

	def generateSample(EPackage p, EClass rootClass) '''
		Sample «p.name.toFirstUpper»DataSample 
		
		for "«p.nsURI»"
		generateRootObject «rootClass.name»
		
		fileExtension "«p.name»"
		
		rootGenerator generate  «rootClass.name» {
			
		«rootClass.generateSample»
		
		}
	'''

	def generateSample(EClass c) '''
		«pushCompoLevel»
		«IF compoLevel <= MAX_LEVEL»
		
		«c.generateAttributes»
		
		«c.generateCompositions»
		
		«c.generateAssociations»
		«ENDIF»
		«popCompoLevel»
	'''

	def generateAttributes(EClass c) '''
		// Generate attributes 
		«FOR a : c.EAllAttributes»
			«a.generateFieldGenerator»
		«ENDFOR»
	'''

	def generateCompositions(EClass c) '''
		// Generate compositions 
		«FOR a : c.EAllContainments»
			«a.generateCompositionGenerator»
		«ENDFOR»
		
	'''

	def generateAssociations(EClass c) '''
		// Generate associations 
		«FOR a : c.EAllReferences.filter[!containment]»
			«a.generateAssociationGenerator»
		«ENDFOR»
	'''

	def generateCompositionGenerator(EReference reference) '''
		forTheComposition «reference.name» «reference.EReferenceType.entityGenerator»
	'''

	def generateAssociationGenerator(EReference reference) '''
		forTheAssociation «reference.name» use AssociationGenerator  // To be fixed
	'''

	def generateFieldGenerator(EAttribute attribute) ''' 
		forTheField «attribute.name» use «attribute.bestGenerator»
	'''

	def String bestGenerator(EAttribute attribute) {
		switch (attribute.EType.name) {
			case "EString": "StringGenerator"
			case "EInt": "IntGenerator"
			case "EBoolean": "BooleanGenerator"
			default : "UndefinedGenerator"
		}
	}

	def entityGenerator(EClass c) '''
		«IF (c.isAbstract)»
			use {
			«FOR sub : DataSampleUtil.getSubClasses(c)»
				«sub.entityGenerator»
			«ENDFOR»
			}
		«ELSE»
			generate 1 instancesOf «c.name» { 
				«c.generateSample»
			}
			«ENDIF»
	'''

	def EClass getRootClass(EPackage p) {
		sortedClasses = new ArrayList
		sortedClasses.addAll(p.EClassifiers)
		Collections.sort(sortedClasses, new ClassifierComparator());
		sortedClasses.filter(EClass).last

	}

	int compoLevel; // Manage composition level to avoid to go too deeply...
	static int MAX_LEVEL = 2

	def pushCompoLevel() { compoLevel++ return "" }

	def popCompoLevel() { compoLevel-- return "" }

	def static void main(String[] args) {

		val gen = new DataSampleTemplateGenerator

		val result = gen.generateSample(EcorePackage.eINSTANCE, EcorePackage.eINSTANCE.EPackage)

		println("RESULTAT = ")
		println(result.toString)
	}
}
