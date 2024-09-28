package com.CoreX;

import java.util.Arrays;

import com.CoreX.Arrays.ArrayUtils;
import com.CoreX.Calculatiom.SimpleCalculation;
import com.CoreX.Converter.Convert;
import com.CoreX.Converter.DataTypeConverter;
import com.CoreX.Scanner.Input;
import com.CoreX.Strings.StringUtils;

public class Test {
	
	public static void main(String[] args) {
		
		int [] arr = {2,5,7,4,6,9,15};
		ArrayUtils utils = new ArrayUtils();
		StringUtils stringutil = new StringUtils();
		System.out.println(stringutil.largestUniqueSubstring("abcabbcab"));
		System.out.println(stringutil.mostFrequentChar("inbanithi"));
		System.out.println(Arrays.toString(utils.twoSum(arr, 22)));
		System.out.println(stringutil.mostRepeatingSubstring("banana"));
	}

}
