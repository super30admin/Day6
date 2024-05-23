// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// logic : The logic behind the code is based on counting the frequencies of each character
// and determining how many characters can be paired to form a palindrome.

class Solution {
    public int longestPalindrome(String s) {
        // If the input string is null or empty, return -1 as a flag for invalid input.
        if (s == null || s.length() == 0) {
            return -1;
        }

        // Use a HashSet to track characters that have an odd count.
        HashSet<Character> str = new HashSet<>();
        int count = 0;  // This will store the length of the longest palindrome.

        // Iterate through each character in the string.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is already in the set, it means we've seen it before
            // and can form a pair (because we now have an even count of this character).
            if (str.contains(ch)) {
                count += 2;  // Add 2 to the count for the pair.
                str.remove(ch);  // Remove the character from the set since it's now paired.
            } else {
                // If the character is not in the set, add it to the set to track that it has an odd count.
                str.add(ch);
            }
        }

        // If there are any characters left in the set, it means they have an odd count.
        // We can add one of these characters to the center of the palindrome.
        if (!str.isEmpty()) {
            count += 1;  // Add 1 to the count for the center character.
        }

        // Return the total count which represents the length of the longest palindrome.
        return count;
    }
}
