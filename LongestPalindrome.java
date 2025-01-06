//Time Complexity = O(n)
//Space.Complexity = O(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach in three sentences only
/**
 * Approach: 
 * In this problem we have a String s and the problem is to find the length of the longest palindrome that can be built with those letters.
 * I have used the a HashSet that is used to track characters that have an odd number of occurrences in the string.
 * For each character, if it has appeared before, we can form a palindrome pair and increase the length by 2, 
 * otherwise, we add it to the set. After processing all characters, if there are any remaining characters in the set, one can be placed 
 * in the center of the palindrome, so we add 1 to the total length.
 */ 
class Solution {
    public int longestPalindrome(String s) {
        // if the input string is null or empty, return 0
        if(s == null || s.length() == 0) {
            return 0;
        }

        // If the string has only one character, it can form a palindrome of length 1
        if(s.length() == 1) {
            return 1;
        }

        // Set to keep track of characters that have been seen an odd number of times
        Set<Character> set = new HashSet<>();
        int count = 0;

         // Loop through each character in the string
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character has been seen before, we can creat a pair
            if(set.contains(c)) {

                // Increase count by 2, as we can add both occurrences to the palindrome
                count = count + 2;

                // Remove the character from the set, as we've used it for a pair
                set.remove(c);
            } else {

                // If the character is seen for the first time, add it to the set
                set.add(c);
            }
        }
        if(!set.isEmpty()) {
            count++;
        }
        // Return the length of the longest possible palindrome
        return count;
    }
}
  

        