package com.CoreX;

import com.CoreX.Calculatiom.SimpleCalculation;
import com.CoreX.Converter.Convert;
import com.CoreX.Converter.DataTypeConverter;
import com.CoreX.Scanner.Input;

public class Test {
	
	public static void main(String[] args) {
		
		Input input = new Input();
		Convert convert = input.getInput("Enter a number", String.class);
		System.out.println(convert.getStringdata());
	}

}
