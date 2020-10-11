package com.opcoach.datasample;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

// This interface overrides the generated interface and will be returned by factory
public interface AssociationGenerator extends MAssociationGenerator
{
	// You can write additional methods using an empty default java 8 notation 
	// because the generated implemented class extends this interface and is not abstract
	//
	// For instance : 
	// default public void addSomething(Something foo) {} ;
	
	default public void setValues(Collection<EObject> possibleValues) {};
	
	
	/** The structural feature contained in a ChildrenGenerator is always an EReference */
	default public EReference getEReference() { return (EReference) getStructuralFeature(); }


}
