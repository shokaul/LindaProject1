package com.lindacare.technical.assessment;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import junit.framework.Assert;

@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class FooBarQixKataTest {
	
	private FooBarQixKata kata = null;
	
	@Before
	public void arrange() {
		kata = new FooBarQixKata();
	}

	@Test(expected = IllegalArgumentException.class)
	public void test01_compute_WhenNumberMinus1_ThrowsIllegalArgumentException() {
		// Arrange
		int number = 3;
		
		// Act
		
		//BELOW CODE IS WRITTEN BY SHOBHTI KAUL, THIS IS TO GIVE CALL TO FUNCTIONS BY PASSING  VARIOUS INTEGER VALUES : IT DOES NOT ACCEPT FLOAT VALUES
		String str=kata.compute(number);
		
		
		if (str.equals("FooFoo"))
			System.out.println("expected value is FooFoo and actual value is:="+str);
		else
			System.out.println("do not match");
		
			//in below code we are passing different integer values and expect result to be like that	
		int number1 = 33;
				
				// Act
				String str1=kata.compute(number1);
				
				
				if (str1.equals("FooFooFoo"))
					System.out.println("expected value is FooFoofoo and actual value is:="+str1);
				else
					System.out.println("do not match");
			
		int number2 = 105;
				
				// Act
				String str2=kata.compute(number2);
				
				if (str2.equals("FooBarQix*Bar"))
					System.out.println("expected value is FooBarQix*Bar and actual value is:="+str2);
				else
					System.out.println("do not match");
				
				
		int number3 = 21;
				
				// Act
				String str3=kata.compute(number3);
				System.out.println("value is : "+str3);
				
		int number4 = 100;
				
				// Act
				String str4=kata.compute(number4);
				System.out.println("value is : "+str4);
				
				
		int number5 = -21;
				
				// Act
				String str5=kata.compute(number5);
				System.out.println("value is : "+str5);
				
		int number6 = 8;
				
				// Act
				String str6=kata.compute(number6);
				System.out.println("value is : "+str6);
				
			/*	
		float number7 =(float) 15.15;  // this will not work : as the function we have created ONLY accept integer Values and NOT decimal values 
				
				// Act
				String str7=kata.compute(number7);
				System.out.println("value is : "+str7);
				
		*/
				
		
	}
}
