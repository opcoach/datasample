package com.opcoach.datasample.util;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.opcoach.datasample.FieldGenerator;
import com.opcoach.datasample.impl.GenerationCatalog;

/** A class to gather helper methods for this project */
public class DataSampleHelper {

	/**
	 * Generate a value using a generator and set this value on the
	 * StructuralFeature of current instance.
	 *
	 * 
	 * @param targetObject : the EObject that must be set
	 * @param sf           : the EStructural feature to setup
	 * @param fg           : the field generator to use to generate the value
	 */
	public static void generateAndSetValue(EObject targetObject, EStructuralFeature sf, FieldGenerator fg, GenerationCatalog gcat) {

		if ((targetObject == null) || (fg == null))
			return;

		Object generated = fg.generateValue(gcat);
		
		if (generated == null) return;  // If nothing is generated, nothing to setup
		
		Object valueToSet = generated;

		if (!sf.isMany() && (fg.isMany())) {
			// generated is a list.. must keep the first element
			List<?> childList = (List<?>) generated;
			valueToSet = (childList == null || childList.isEmpty()) ? null : childList.get(0);
		}
		if (sf.isMany() && fg.getNumber() == 1) {
			// generated is an EObject, must create a list with it ...
			valueToSet = Arrays.asList(generated);
		}

		try {
			if (valueToSet != null)
				targetObject.eSet(sf, valueToSet);
		} catch (Exception e) {
			DSLogger.error("Unable to set value on " + sf.getName(), e);
		}

	}

}
