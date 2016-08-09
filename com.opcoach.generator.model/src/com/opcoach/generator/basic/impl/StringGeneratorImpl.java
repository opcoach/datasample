package com.opcoach.generator.basic.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Vector;

import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.generator.basic.StringGenerator;

// This class overrides the generated class and will be instantiated by factory
public class StringGeneratorImpl extends MStringGeneratorImpl implements StringGenerator
{
	/** A counter to generate value with ID, when no data have been found */
	private static int counter = 0;

	/**
	 * The location where data files should be searched (initialized by default
	 * with the bundle location)
	 */
	public static String rootData = null;

	/** A lock to know if data should be read (use the locale) */
	private boolean mustReadValues = true;

	protected StringGeneratorImpl()
	{
		super();

		if (rootData == null)
		{
			// Get root data from bundle (default value).
			Bundle b = FrameworkUtil.getBundle(getClass());
			if (b == null)
			{
				System.out.println("-->> Not an OSGi runtime. No rootData initialized for String Generators");
			} else
			{
				URL dataUrl = b.getEntry("data");
				try
				{
					URL fdata = FileLocator.toFileURL(dataUrl);
					System.out.println("Initialize rootData with " + fdata.getFile());
					setRootData(fdata.getFile());
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	
	
	public static void setRootData(String root)
	{
		rootData = root;

	}
	
	@Override
	protected String generateSimpleValue()
	{
		String result = super.generateSimpleValue();

		// If no sample file is provided, generate a default string value
		return (result == null) ? generateDefaultString() : result;
	}

	@Override
	protected String generateRandomValue()
	{
		String result = super.generateRandomValue();
		// If no sample file is provided, generate a default string value

		return (result == null) ? generateDefaultString() : result;
	}

	private String generateDefaultString()
	{
		String ID = getID();
		return ((ID == null) ? "" : ID) + counter++;

	}

	@Override
	public String generateValue()
	{
		String result = super.generateValue();

		// Manage the case policy
		if (result != null)
		{
			// With bad value generator, it's possible to get here a null value
			switch (casePolicy)
			{
			case LOWERCASE:
				result = result.toLowerCase();
				break;
			case UPPERCASE:
				result = result.toUpperCase();
				break;
			default:
				break;
			}
		}

		return result;

	}
	
	@Override
	public Collection<String> getValues()
	{
		if (mustReadValues)
		{
			readValues();
		}
		// Get the values according to filename and current locale
		return super.getValues();
	}

	
	/** Read the datafile, and initialize values */
	private void readValues()
	{
 		computeFileName();
		String df = getDataFilename();
		if (df == null)
		{
			mustReadValues = false; // No values to be read
			return;
		}

		BufferedReader bf = null;
		try
		{
			File f = new File(df);
			if (f.exists())
			{
				values = new Vector<String>();
				FileReader reader = new FileReader(f);
				bf = new BufferedReader(reader);
				String s = null;
				while ((s = bf.readLine()) != null)
				{
					addValue(s);
				}

			}
		} catch (Exception ex)
		{
			System.out.println("Unable to read values in file : " + df);
		} finally
		{
			if (bf != null)
				try
				{
					bf.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
		}
		mustReadValues = false;

	}

	
	private void computeFileName()
	{
		final String DATA_FILE_EXT = ".txt";

		if (getID() == null)
			return;

		// According to ID, try to read a file containing possible values
		// Id may be set with several parts : rental.Customer.FirstName :  P1.P2.P3
		// WARNING : Files are searched with names in lowercase : Customer.FirstName -> customer.firstname.txt
		// Use the rootData if it has been set and the locale (optional)
		// Search order is like this :
		// 1. rootData/nl/P0.P1.P2.txt
		// 2. rootData/nl/P0.P1.txt
		// 3. rootData/nl/P0.txt
		// By default rootData is initialized with the location of
		// com.opcoach.generator Bundle

		String nl = (getLocale() == null) ? "" : getLocale().getLanguage();
		// 1. search for rootData/nl/P0.P1.P2.txt
		String rootPath = rootData + nl + File.separator;
		String fname = rootPath + getID().toLowerCase() + DATA_FILE_EXT;
		File f = new File(fname);
		if (f.exists())
			setDataFilename(fname);
		else
		{
			// 2. rootData/nl/P0.P1.txt
			String[] names = getID().toLowerCase().split("\\.", 3);
			System.out.println("Found this names : " + names);
			int fieldIndex = 1;			
			if (names.length == 3)
			{
				// This is a package notation : P0.P1.P2, try to find P1.P2 (skip package name)
				fname = rootPath + names[1] + "." + names[2] + DATA_FILE_EXT;
				f = new File(fname);
				if (f.exists())
				{
					setDataFilename(fname);
					return;
				}
				fieldIndex = 2;

			}
			
			if (names.length == 2)
				fieldIndex = 1;
			if (names.length == 1)
				fieldIndex = 0;

			// Keep only the field name : P1.txt or P2.txt
			fname = rootPath + names[fieldIndex] + DATA_FILE_EXT;
			f = new File(fname);
			if (f.exists())
				setDataFilename(fname);

		}

	}



}
