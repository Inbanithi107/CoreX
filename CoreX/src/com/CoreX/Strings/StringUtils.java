package com.CoreX.Strings;

import java.util.HashMap;
import java.util.HashSet;

/**
 * <h5>This class contains String Utilities</h5>
 */
public class StringUtils {
	
	/**
	 * 
	 * @param String
	 * @return largestUniqueSubstring
	 */
	public String largestUniqueSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        String longestSubstring = "";

        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, shrink the window from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            charSet.add(s.charAt(right));

            // Update the longest substring if the current one is longer
            if (right - left + 1 > longestSubstring.length()) {
                longestSubstring = s.substring(left, right + 1);
            }
        }

        return longestSubstring;
    }
	
	/**
	 * 
	 * @param String
	 * @return
	 */
	public char mostFrequentChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = '\0'; // Placeholder for the most frequent character
        int maxCount = 0;

        // Find the character with the highest count
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                maxCount = charCount.get(c);
                mostFrequent = c;
            }
        }

        return mostFrequent;
    }
	
	/**
     * Finds the most repeating substring in the given string.
     *
     * @param s the input string
     * @return the most repeating substring, or an empty string if no repeating substring is found
     */
    public String mostRepeatingSubstring(String s) {
        HashMap<String, Integer> substringCount = new HashMap<>();
        String mostFrequentSubstring = "";
        int maxCount = 0;

        // Generate all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);
            }
        }

        // Find the most frequent substring
        for (String substring : substringCount.keySet()) {
            int count = substringCount.get(substring);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentSubstring = substring;
            }
        }

        // Return the most frequent substring
        return maxCount > 1 ? mostFrequentSubstring : "";
    }



}
