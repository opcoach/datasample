package com.opcoach.datasample.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.opcoach.datasample.DataSample;
import com.opcoach.datasample.DatasamplePackage;
import com.opcoach.datasample.EntityGenerator;
import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.xtext.services.DataSampleDSLGrammarAccess;
import com.opcoach.generator.GeneratorPackage;
import com.opcoach.generator.ReferenceGenerator;
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
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractDataSampleDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DataSampleDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DatasamplePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DatasamplePackage.DATA_SAMPLE:
				if(context == grammarAccess.getDataSampleRule()) {
					sequence_DataSample(context, (DataSample) semanticObject); 
					return; 
				}
				else break;
			case DatasamplePackage.ENTITY_GENERATOR:
				if(context == grammarAccess.getEntityGeneratorRule()) {
					sequence_EntityGenerator(context, (EntityGenerator) semanticObject); 
					return; 
				}
				else break;
			case DatasamplePackage.FIELD_GENERATOR:
				if(context == grammarAccess.getFieldGeneratorRule()) {
					sequence_FieldGenerator(context, (FieldGenerator) semanticObject); 
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
				   context == grammarAccess.getEDataType_ImplRule()) {
					sequence_EDataType_Impl(context, (EDataType) semanticObject); 
					return; 
				}
				else break;
			case EcorePackage.EENUM:
				if(context == grammarAccess.getEClassifierRule() ||
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
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         seed=EInt? 
	 *         language=Language? 
	 *         packageURI=EString? 
	 *         (badValueGeneratorNames+=EString badValueGeneratorNames+=EString*)? 
	 *         package=[EPackage|EString]? 
	 *         rootEntity=[EClass|EString]? 
	 *         (entityGenerators+=EntityGenerator entityGenerators+=EntityGenerator*)? 
	 *         (fieldGenerators+=FieldGenerator fieldGenerators+=FieldGenerator*)?
	 *     )
	 */
	protected void sequence_DataSample(EObject context, DataSample semanticObject) {
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
	 *     (number=EInt? entityName=EString? entity=[EClass|EString]?)
	 */
	protected void sequence_EntityGenerator(EObject context, EntityGenerator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         entityName=EString? 
	 *         fieldName=EString? 
	 *         errorRate=EInt? 
	 *         generatorName=EString? 
	 *         generator=[ValueGenerator|EString] 
	 *         structuralFeature=[EStructuralFeature|EString]?
	 *     )
	 */
	protected void sequence_FieldGenerator(EObject context, FieldGenerator semanticObject) {
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
