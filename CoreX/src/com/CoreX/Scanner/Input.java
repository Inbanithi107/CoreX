package com.CoreX.Scanner;

import java.util.Scanner;

import com.CoreX.Converter.Convert;

/**
 * This class contains input from console for various data types
 */
public class Input {
	
	public static Scanner s = new Scanner(System.in);
	
	/**
	 * 
	 * @param message
	 * @param Type
	 */
	public Convert getInput(String message, Class<?> Type) {
		
		Convert convert = new Convert();
		
		System.out.println(message);
		
		if(Type==Integer.class) {
			int result=s.nextInt();
			convert.setIntegerdata(result);
			return convert;
		}
		if(Type==Double.class) {
			double result=s.nextDouble();
			convert.setDoubledata(result);
			return convert;
		}
		if(Type==Float.class) {
			float result=s.nextFloat();
			convert.setFloatdata(result);
			return convert;
		}
		if(Type==Long.class) {
			long result=s.nextLong();
			convert.setLongdata(result);
			return convert;
		}
		if(Type==Character.class) {
			char result=s.next().charAt(0);
			convert.setChardata(result);
			return convert;
		}
		if(Type==String.class) {
			String result=s.nextLine();
			convert.setStringdata(result);
			return convert;
		}
		
		return convert;
		
	}

}
