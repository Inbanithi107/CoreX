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
	public Object getInput(String message, Class<?> Type) {
		
		Convert convert = new Convert();
		
		System.out.println(message);
		
		if(Type==Integer.class) {
			int result=s.nextInt();
			
			return result;
		}
		if(Type==Double.class) {
			double result=s.nextDouble();
			
			return result;
		}
		if(Type==Float.class) {
			float result=s.nextFloat();
			
			return result;
		}
		if(Type==Long.class) {
			long result=s.nextLong();
			
			return result;
		}
		if(Type==Character.class) {
			char result=s.next().charAt(0);
			
			return result;
		}
		if(Type==String.class) {
			String result=s.nextLine();
			
			return result;
		}
		
		return new Object();
		
	}
	
	public Object getInput(Class<?> Type) {
		if(Type==Integer.class) {
			int result=s.nextInt();
			
			return result;
		}
		if(Type==Double.class) {
			double result=s.nextDouble();
			
			return result;
		}
		if(Type==Float.class) {
			float result=s.nextFloat();
			
			return result;
		}
		if(Type==Long.class) {
			long result=s.nextLong();
			
			return result;
		}
		if(Type==Character.class) {
			char result=s.next().charAt(0);
			
			return result;
		}
		if(Type==String.class) {
			String result=s.nextLine();
			
			return result;
		}
		
		return new Object();
	}

}
