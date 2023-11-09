package com.srishti.JunitAndMockito;

public class Calculate 
{
	CalculateInterface calService;
	
	public Calculate(CalculateInterface calService) {
		super();
		this.calService = calService;
	}

	public int operation(int a, int b) 
	{
		int sum = calService.add(a, b); 
		return sum * 10;
		
		//To test verify(service) of Mockito
		//return (a+b) * 10;
	}
	
	
//  Below is basic Junit code without any service or Mockito.
	
//	public double operation(double a, double b) {
//		return (a + b) * 10;
//	}
}
