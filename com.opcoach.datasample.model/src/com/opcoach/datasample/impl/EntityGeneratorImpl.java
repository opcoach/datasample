package com.opcoach.datasample.impl;

import com.opcoach.datasample.EntityGenerator;

// This class overrides the generated class and will be instantiated by factory
public class EntityGeneratorImpl extends MEntityGeneratorImpl implements EntityGenerator
{

	
	public EntityGeneratorImpl() {
		super();
		System.out.println("Create an EntityGeneratorImpl");
	}
}
