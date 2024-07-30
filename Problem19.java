// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int longestPalindrome(String s) {
        // HashMap to store character counts
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOddCount = false;

        // Calculate the length of the longest palindrome
        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOddCount = true;
            }
        }

        // Add one if there is an odd count character to place in the middle
        if (hasOddCount) {
            length += 1;
        }

        return length;
    }
}