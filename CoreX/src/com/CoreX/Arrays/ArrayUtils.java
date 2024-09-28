package com.CoreX.Arrays;

import java.util.HashMap;

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
	
	/**
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * <br>Reverse an integer array
	 */
	public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
	
	/**
	 * 
	 * @param arr
	 * @param n
	 * <br>Rotates an array n times
	 */
	public void rotate(int[] arr, int n) {
        int length = arr.length;
        // Handle cases where n is greater than the length of the array
        n = n % length; // Only need to rotate n times
        
        if (n == 0) return; // No need to rotate if n is 0

        // Reverse the whole array
        reverse(arr, 0, length - 1);
        // Reverse the first n elements
        reverse(arr, 0, n - 1);
        // Reverse the remaining elements
        reverse(arr, n, length - 1);
    }
	
	/**
	 * 
	 * @param arr
	 * @return
	 */
	 public static int mostRepeatingInt(int[] arr) {
	        HashMap<Integer, Integer> countMap = new HashMap<>();
	        
	        // Count occurrences of each integer
	        for (int num : arr) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        int mostFrequent = arr[0]; // Placeholder for the most frequent integer
	        int maxCount = 0;

	        // Find the integer with the highest count
	        for (int key : countMap.keySet()) {
	            if (countMap.get(key) > maxCount) {
	                maxCount = countMap.get(key);
	                mostFrequent = key;
	            }
	        }

	        return mostFrequent;
	    }
	 
	 /**
	  * 
	  * @param nums
	  * @param target
	  * @return The indicies of the two numbers
	  */
	 public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> numMap = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (numMap.containsKey(complement)) {
	                return new int[] { numMap.get(complement), i };
	            }
	            numMap.put(nums[i], i);
	        }

	        throw new IllegalArgumentException("No two sum solution");
	    }

}
