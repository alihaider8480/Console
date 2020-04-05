package com;

import java.util.Iterator;
import java.util.Random;

public class lallal
{
	static char[] otpgen(int num)
	{
		Random rand = new Random();
		String numbers = "0123456789";
		char arr[] = new char[num];
		for (int i = 0; i < num; i++) 
		{
			arr[i] = numbers.charAt(rand.nextInt(numbers.length()));
			System.out.println(arr[i]);
		}
		return arr;
		
	}
	
	public static void main(String[] args) 
	{
	 System.out.println("OTP Generating..."); 
     System.out.println(otpgen(4));
	 
	}
}