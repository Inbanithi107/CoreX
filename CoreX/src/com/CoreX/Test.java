package com.CoreX;

import com.CoreX.Arrays.ArrayUtils;
import com.CoreX.Calculatiom.SimpleCalculation;
import com.CoreX.Converter.Convert;
import com.CoreX.Converter.DataTypeConverter;
import com.CoreX.Scanner.Input;

public class Test {
	
	public static void main(String[] args) {
		
		int [] arr = {2,5,7,4,6,9,15};
		ArrayUtils utils = new ArrayUtils();
		
			int a=utils.LinearSearch(arr, 1);
			System.out.println(a+1);
		Input input = new Input();
		int[] arr1 = input.GetArray(5);
		for(int i:arr1) {
			System.out.println(i);
		}
	}

}
