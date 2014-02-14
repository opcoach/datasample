package com.opcoach.dsgen.xtext.serializer;

import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

import com.google.inject.Inject;
import com.opcoach.dsgen.BadValueGeneratorRegistry;
import com.opcoach.dsgen.DSGenAttribute;
import com.opcoach.dsgen.DSGenClass;
import com.opcoach.dsgen.DSGenDataType;
import com.opcoach.dsgen.DSGenEnum;
import com.opcoach.dsgen.DSGenFeature;
import com.opcoach.dsgen.DSGenModel;
import com.opcoach.dsgen.DSGenPackage;
import com.opcoach.dsgen.DSGenReference;
import com.opcoach.dsgen.DataSampleGenPackage;
import com.opcoach.dsgen.generator.DSGenGeneratorPackage;
import com.opcoach.dsgen.generator.EObjectGenerator;
import com.opcoach.dsgen.xtext.services.DSGenDSLGrammarAccess;
import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.ReferenceGenerator;

@SuppressWarnings("all")
public abstract class AbstractDSGenDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DSGenDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DataSampleGenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DataSampleGenPackage.BAD_VALUE_GENERATOR_REGISTRY:
				if(context == grammarAccess.getBadValueGeneratorRegistryRule()) {
					sequence_BadValueGeneratorRegistry(context, (BadValueGeneratorRegistry) semanticObject); 
					return; 
				}
				else break;
			case DataSampleGenPackage.DS_GEN_ATTRIBUTE:
				if(context == grammarAccess.getDSGenAttributeRule() ||
				   context == grammarAccess.getDSGenFeatureRule()) {
					sequence_DSGenAttribute(context, (DSGenAttribute) semanticObject); 
					return; 
				}
				else break;
			case DataSampleGenPackage.DS_GEN_CLASS:
				if(context == grammarAccess.getDSGenClassRule() ||
				   context == grammarAccess.getDSGenClassifierRule()) {
					sequence_DSGenClass(context, (DSGenClass) semanticObject); 
					return; 
				}
				else break;
			case DataSampleGenPackage.DS_GEN_DATA_TYPE:
				if(context == grammarAccess.getDSGenClassifierRule() ||
				   context == grammarAccess.getDSGenDataType_ImplRule()) {
					sequence_DSGenDataType_Impl(context, (DSGenDataType) semanticObject); 
					return; 
				}
				else break;
			case DataSampleGenPackage.DS_GEN_ENUM:
				if(context == grammarAccess.getDSGenClassifierRule() ||
				   context == grammarAccess.getDSGenEnumRule()) {
					sequence_DSGenEnum(context, (DSGenEnum) semanticObject); 
					return; 
				}
				else break;
			case DataSampleGenPackage.DS_GEN_FEATURE:
				if(context == grammarAccess.getDSGenFeatureRule() ||
				   context == grammarAccess.getDSGenFeature_ImplRule()) {
					sequence_DSGenFeature_Impl(context, (DSGenFeature) semanticObject); 
					return; 
				}
				else break;
			case DataSampleGenPackage.DS_GEN_MODEL:
				if(context == grammarAccess.getDSGenModelRule()) {
					sequence_DSGenModel(context, (DSGenModel) semanticObject); 
					return; 
				}
				else break;
			case DataSampleGenPackage.DS_GEN_PACKAGE:
				if(context == grammarAccess.getDSGenPackageRule()) {
					sequence_DSGenPackage(context, (DSGenPackage) semanticObject); 
					return; 
				}
				else break;
			case DataSampleGenPackage.DS_GEN_REFERENCE:
				if(context == grammarAccess.getDSGenFeatureRule() ||
				   context == grammarAccess.getDSGenReferenceRule()) {
					sequence_DSGenReference(context, (DSGenReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == EcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EANNOTATION:
				if(context == grammarAccess.getEAnnotationRule()) {
					sequence_EAnnotation(context, (EAnnotation) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EATTRIBUTE:
				if(context == grammarAccess.getEAttributeRule() ||
				   context == grammarAccess.getEStructuralFeatureRule()) {
					sequence_EAttribute(context, (EAttribute) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.ECLASS:
				if(context == grammarAccess.getEClassRule() ||
				   context == grammarAccess.getEClassifierRule()) {
					sequence_EClass(context, (EClass) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EDATA_TYPE:
				if(context == grammarAccess.getEClassifierRule() ||
				   context == grammarAccess.getEDataTypeRule() ||
				   context == grammarAccess.getEDataType_ImplRule()) {
					sequence_EDataType_Impl(context, (EDataType) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EENUM:
				if(context == grammarAccess.getEClassifierRule() ||
				   context == grammarAccess.getEDataTypeRule() ||
				   context == grammarAccess.getEEnumRule()) {
					sequence_EEnum(context, (EEnum) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EENUM_LITERAL:
				if(context == grammarAccess.getEEnumLiteralRule()) {
					sequence_EEnumLiteral(context, (EEnumLiteral) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EGENERIC_TYPE:
				if(context == grammarAccess.getEGenericTypeRule()) {
					sequence_EGenericType(context, (EGenericType) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EOBJECT:
				if(context == grammarAccess.getEObjectRule()) {
					sequence_EObject(context, (EObject) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EOPERATION:
				if(context == grammarAccess.getEOperationRule()) {
					sequence_EOperation(context, (EOperation) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EPACKAGE:
				if(context == grammarAccess.getEPackageRule()) {
					sequence_EPackage(context, (EPackage) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EPARAMETER:
				if(context == grammarAccess.getEParameterRule()) {
					sequence_EParameter(context, (EParameter) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EREFERENCE:
				if(context == grammarAccess.getEReferenceRule() ||
				   context == grammarAccess.getEStructuralFeatureRule()) {
					sequence_EReference(context, (EReference) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY:
				if(context == grammarAccess.getEStringToStringMapEntryRule()) {
					sequence_EStringToStringMapEntry(context, (Entry<?, ?>) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.ETYPE_PARAMETER:
				if(context == grammarAccess.getETypeParameterRule()) {
					sequence_ETypeParameter(context, (ETypeParameter) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == GeneratorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GeneratorPackage.REFERENCE_GENERATOR:
				if(context == grammarAccess.getReferenceGeneratorRule() ||
				   context == grammarAccess.getValueGeneratorRule()) {
					sequence_ReferenceGenerator(context, (ReferenceGenerator) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == DSGenGeneratorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DSGenGeneratorPackage.EOBJECT_GENERATOR:
				if(context == grammarAccess.getEObjectGeneratorRule()) {
					sequence_EObjectGenerator(context, (EObjectGenerator) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((generators+=ValueGenerator generators+=ValueGenerator*)?)
	 */
	protected void sequence_BadValueGeneratorRegistry(EObject context, BadValueGeneratorRegistry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecoreFeature=[EStructuralFeature|EString] generator=ValueGenerator?)
	 */
	protected void sequence_DSGenAttribute(EObject context, DSGenAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecoreClass=[EClass|EString] (dsgenFeatures+=DSGenFeature dsgenFeatures+=DSGenFeature*)? generator=EObjectGenerator?)
	 */
	protected void sequence_DSGenClass(EObject context, DSGenClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecoreClass=[EClass|EString] dataType=[EDataType|EString] (dsgenFeatures+=DSGenFeature dsgenFeatures+=DSGenFeature*)?)
	 */
	protected void sequence_DSGenDataType_Impl(EObject context, DSGenDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecoreClass=[EClass|EString] dataType=[EDataType|EString] ecoreEnum=[EEnum|EString] (dsgenFeatures+=DSGenFeature dsgenFeatures+=DSGenFeature*)?)
	 */
	protected void sequence_DSGenEnum(EObject context, DSGenEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecoreFeature=[EStructuralFeature|EString] generator=ValueGenerator?)
	 */
	protected void sequence_DSGenFeature_Impl(EObject context, DSGenFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         randomSeed=ELong? 
	 *         language=EString? 
	 *         (dsgenPackages+=DSGenPackage dsgenPackages+=DSGenPackage*)? 
	 *         badGenerators=BadValueGeneratorRegistry
	 *     )
	 */
	protected void sequence_DSGenModel(EObject context, DSGenModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecorePackage=[EPackage|EString] (dsgenClassifiers+=DSGenClassifier dsgenClassifiers+=DSGenClassifier*)?)
	 */
	protected void sequence_DSGenPackage(EObject context, DSGenPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecoreFeature=[EStructuralFeature|EString] targetDSGenClass=[DSGenClass|EString]? generator=ValueGenerator?)
	 */
	protected void sequence_DSGenReference(EObject context, DSGenReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         source=EString? 
	 *         (references+=[EObject|EString] references+=[EObject|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (details+=EStringToStringMapEntry details+=EStringToStringMapEntry*)? 
	 *         (contents+=EObject contents+=EObject*)?
	 *     )
	 */
	protected void sequence_EAnnotation(EObject context, EAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         iD?='iD'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EAttribute(EObject context, EAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         interface?='interface'? 
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         (eSuperTypes+=[EClass|EString] eSuperTypes+=[EClass|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eOperations+=EOperation eOperations+=EOperation*)? 
	 *         (eStructuralFeatures+=EStructuralFeature eStructuralFeatures+=EStructuralFeature*)? 
	 *         (eGenericSuperTypes+=EGenericType eGenericSuperTypes+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EClass(EObject context, EClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)?
	 *     )
	 */
	protected void sequence_EDataType_Impl(EObject context, EDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString value=EInt? literal=EString? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_EEnumLiteral(EObject context, EEnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eLiterals+=EEnumLiteral eLiterals+=EEnumLiteral*)?
	 *     )
	 */
	protected void sequence_EEnum(EObject context, EEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         eTypeParameter=[ETypeParameter|EString]? 
	 *         eClassifier=[EClassifier|EString]? 
	 *         eUpperBound=EGenericType? 
	 *         (eTypeArguments+=EGenericType eTypeArguments+=EGenericType*)? 
	 *         eLowerBound=EGenericType?
	 *     )
	 */
	protected void sequence_EGenericType(EObject context, EGenericType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         badValueProportion=EInt? 
	 *         randomSeed=ELong? 
	 *         ID=EString? 
	 *         locale=Locale? 
	 *         badValueGenerator=[ValueGenerator|EString]? 
	 *         targetDSGenClass=[DSGenClass|EString]?
	 *     )
	 */
	protected void sequence_EObjectGenerator(EObject context, EObjectGenerator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(EObject context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eExceptions+=[EClassifier|EString] eExceptions+=[EClassifier|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eParameters+=EParameter eParameters+=EParameter*)? 
	 *         (eGenericExceptions+=EGenericType eGenericExceptions+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EOperation(EObject context, EOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         nsURI=EString? 
	 *         nsPrefix=EString? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eClassifiers+=EClassifier eClassifiers+=EClassifier*)? 
	 *         (eSubpackages+=EPackage eSubpackages+=EPackage*)?
	 *     )
	 */
	protected void sequence_EPackage(EObject context, EPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EParameter(EObject context, EParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         containment?='containment'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         resolveProxies=EBoolean? 
	 *         eType=[EClassifier|EString]? 
	 *         eOpposite=[EReference|EString]? 
	 *         (eKeys+=[EAttribute|EString] eKeys+=[EAttribute|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EReference(EObject context, EReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=EString? value=EString?)
	 */
	protected void sequence_EStringToStringMapEntry(EObject context, Entry<?, ?> semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? (eBounds+=EGenericType eBounds+=EGenericType*)?)
	 */
	protected void sequence_ETypeParameter(EObject context, ETypeParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         badValueProportion=EInt? 
	 *         randomSeed=ELong? 
	 *         ID=EString? 
	 *         locale=Locale? 
	 *         step=EInt? 
	 *         badValueGenerator=[ValueGenerator|EString]?
	 *     )
	 */
	protected void sequence_ReferenceGenerator(EObject context, ReferenceGenerator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
