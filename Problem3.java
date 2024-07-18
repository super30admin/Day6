//Time Complexity: O(n), length of the string
//Space Complexity: O(1)

class Solution {
    public int longestPalindrome(String s) {
        // Initialize an array to count occurrences of each character
        int[] count = new int[128];
        
        // First for loop: count the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
        }
        
        // Initialize variables to calculate the length of the longest palindrome
        int length = 0;
        boolean hasOdd = false;
        
        // Second for loop: calculate the length of the longest palindrome
        for (int i = 0; i < count.length; i++) {
            int n = count[i];
            if (n % 2 == 0) {
                length += n;
            } else {
                length += n - 1;
                hasOdd = true;
            }
        }
        
        // If there's any character with an odd count, we can place one in the middle of the palindrome
        return hasOdd ? length + 1 : length;
    }
}
