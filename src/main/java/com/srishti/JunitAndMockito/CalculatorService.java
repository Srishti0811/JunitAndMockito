package com.srishti.JunitAndMockito;

public class CalculatorService implements CalculateInterface{

	@Override
	public int add(int a, int b) 
	{
		return a + b;
	}

}
