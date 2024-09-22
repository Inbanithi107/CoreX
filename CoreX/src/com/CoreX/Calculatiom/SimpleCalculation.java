package com.CoreX.Calculatiom;

/**
 * <h5>This Class contains basic arithmetic calculation</h5>
 * <br>
 * <h5>Note every methods in the library have input as string and output as string</h5><br>
 * <h5>So make sure the input and output has been correct in your class</h5>
 */
public class SimpleCalculation {
	
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @param data_type
	 * @return Addition of two numbers
	 */
	public String Addition(String number1, String number2, Class<?> Type) {
		
		if(Type==Integer.class) {
			
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		int result=num1+num2;
		return String.valueOf(result);
		
		}else if(Type==Double.class) {
			
			double num1=Double.parseDouble(number1);
			double num2=Double.parseDouble(number1);
			double result=num1+num2;
			return String.valueOf(result);
			
		}else if(Type==Float.class) {
			
			float num1=Float.parseFloat(number1);
			float num2=Float.parseFloat(number2);
			float result=num1+num2;
			return String.valueOf(result);
			
		}
		
		return "Error occured";
	}
	
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @param data_type
	 * @return Subtraction of two numbers
	 */
	public String Subtraction(String number1, String number2, Class<?> Type) {
		
		if(Type==Integer.class) {
			
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		int result=num1-num2;
		return String.valueOf(result);
		
		}else if(Type==Double.class) {
			
			double num1=Double.parseDouble(number1);
			double num2=Double.parseDouble(number1);
			double result=num1-num2;
			return String.valueOf(result);
			
		}else if(Type==Float.class) {
			
			float num1=Float.parseFloat(number1);
			float num2=Float.parseFloat(number2);
			float result=num1-num2;
			return String.valueOf(result);
			
		}
		
		return "Error occured";
	}
	
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @param data_type
	 * @return Multiplication of two numbers
	 */
	public String Multiplication(String number1, String number2, Class<?> Type) {
		
		if(Type==Integer.class) {
			
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		int result=num1*num2;
		return String.valueOf(result);
		
		}else if(Type==Double.class) {
			
			double num1=Double.parseDouble(number1);
			double num2=Double.parseDouble(number1);
			double result=num1*num2;
			return String.valueOf(result);
			
		}else if(Type==Float.class) {
			
			float num1=Float.parseFloat(number1);
			float num2=Float.parseFloat(number2);
			float result=num1*num2;
			return String.valueOf(result);
			
		}
		
		return "Error occured";
	}
	
	/**
	 * 
	 * @param number1
	 * @param number2
	 * @param data_type
	 * @return Division of two numbers
	 */
	public String Division(String number1, String number2, Class<?> Type) {
		
		if(Type==Integer.class) {
			
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		int result=num1/num2;
		return String.valueOf(result);
		
		}else if(Type==Double.class) {
			
			double num1=Double.parseDouble(number1);
			double num2=Double.parseDouble(number1);
			double result=num1/num2;
			return String.valueOf(result);
			
		}else if(Type==Float.class) {
			
			float num1=Float.parseFloat(number1);
			float num2=Float.parseFloat(number2);
			float result=num1/num2;
			return String.valueOf(result);
			
		}
		
		return "Error occured";
	}
	

}
