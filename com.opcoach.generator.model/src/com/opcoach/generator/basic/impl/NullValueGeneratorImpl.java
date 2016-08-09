package com.opcoach.generator.basic.impl;

import com.opcoach.generator.basic.NullValueGenerator;

// This class overrides the generated class and will be instantiated by factory
public class NullValueGeneratorImpl extends MNullValueGeneratorImpl implements NullValueGenerator
{
	@Override
	protected Object generateRandomValue()
	{
		return null;
	}


	@Override
	protected Object generateSimpleValue()
	{
		return null;
	}
}
