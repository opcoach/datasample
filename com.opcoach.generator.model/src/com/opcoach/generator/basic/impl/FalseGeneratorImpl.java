package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.FalseGenerator;

// This class overrides the generated class and will be instantiated by factory
public class FalseGeneratorImpl extends MFalseGeneratorImpl implements FalseGenerator
{
	@Override
	protected Boolean generateRandomValue()
	{
		return Boolean.FALSE;
	}
	
	@Override
	protected Boolean generateSimpleValue()
	{
		return Boolean.FALSE;
	}
}
