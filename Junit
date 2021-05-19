package com.JUnitcodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
	public static void main(String []args)
	{
		Result result=JUnitCore.runClasses(JunitDemo.class);
		for(Failure failure:result.getFailures())
		{
			System.out.println(failure.toString());
			
		}
		System.out.println("Result="+result.wasSuccessful());
		
		
		String str=new String("Naga Sai");
		String str1=new String("Naga Sai");
		String str2=null;
		String str3="N C";
		String str4="N C";
		int val1=5;
		int val2=7;
		String[] a1= {"1","2","3"};
		String[] a2= {"1","2","3"};
		assertEquals(str,str1);
		assertTrue(val1 < val2);
		assertFalse(val1 > val2);
		assertNull(str2);
		assertSame(str3,str4);
		assertNotSame(str,str1);
	}
}
