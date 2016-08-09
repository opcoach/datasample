package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.TrueGenerator;

// This class overrides the generated class and will be instantiated by factory
public class TrueGeneratorImpl extends MTrueGeneratorImpl implements TrueGenerator
{
	@Override
	protected Boolean generateRandomValue()
	{
		return Boolean.TRUE;
	}
	
	@Override
	protected Boolean generateSimpleValue()
	{
		return Boolean.TRUE;
	}


}
