package com.CoreX.Arrays;

/**
 * <h5>This class contains Array Operations</h5>
 */
public class ArrayUtils {
	
	
	/**
	 * 
	 * @param Array
	 * @param Target
	 * @return The index of the target
	 */
	public int LinearSearch(int[] Array, int Target) {
		
		
			for(int i=0;i<Array.length;i++) {
				if(Array[i]==Target) {
					return i;
				}
			}
			return -1;
		 
		
		
	}

}
