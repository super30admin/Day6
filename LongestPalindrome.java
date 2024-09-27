/*
https://leetcode.com/problems/longest-palindrome
Time: O(N)
Space: O(1) the space for freq array, as the alphabet size of s is fixed
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int count = 0;
        boolean oddPresent = false;

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                if (freq[i] % 2 == 0)
                    count += freq[i];

                else {
                    count += freq[i] - 1;
                    oddPresent = true;

                }
            }
        }

        return oddPresent ? count + 1 : count;
    }

}
