// Time Complexity :O(N) 
// Space Complexity :O(1) - 52 characters --> constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        // HashSet to track characters that appear an odd number of times
        HashSet<Character> set = new HashSet<>();
        int longestPalindrome = 0; // Variable to store the length of the longest palindrome

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the set contains the character, it means we have found a pair
            if (set.contains(c)) {
                longestPalindrome += 2; // Add 2 to the palindrome length for the pair
                set.remove(c); // Remove the character from the set
            } else {
                set.add(c); // Add the character to the set
            }
        }

        // If the set is not empty, it means there is at least one character with an odd frequency
        if (!set.isEmpty()) longestPalindrome += 1; // Add 1 to the palindrome length for the central character

        return longestPalindrome; // Return the length of the longest palindrome
    }
}
