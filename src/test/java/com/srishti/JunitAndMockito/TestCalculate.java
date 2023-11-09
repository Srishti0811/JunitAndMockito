package com.srishti.JunitAndMockito;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class TestCalculate {

	Calculate cal = null;
	CalculateInterface calService = mock(CalculateInterface.class);
	
	@Before
	public void init() 
	{
		cal = new Calculate(calService);
	}
	
	//Mainly focused to test the operation method. So hard coded the service.
	@Test
	public void testOperation() {
		when(calService.add(2, 3)).thenReturn(5);
		assertEquals(50, cal.operation(2, 3));
		
		//To verify if service is being used in the flow or now. 
		verify(calService).add(2, 3);
	}

}
