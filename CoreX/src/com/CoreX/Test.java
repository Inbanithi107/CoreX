package com.CoreX;

import com.CoreX.Calculatiom.SimpleCalculation;
import com.CoreX.Converter.Convert;
import com.CoreX.Converter.DataTypeConverter;
import com.CoreX.Scanner.Input;

public class Test {
	
	public static void main(String[] args) {
		
		Input input = new Input();
		char a =(Character) input.getInput("Enter a number", Character.class);
		System.out.println(a);
	}

}
