//Time complexity - O(N)
//Space complexity - O(1)


class Solution {
    public int longestPalindrome(String s) {

        int count[] = new  int[128];

        for(char c: s.toCharArray()) {
            count[c]++;
        }

        int longestPalindromeValue = 0;

        for(int value: count) {

            longestPalindromeValue = longestPalindromeValue + value / 2 * 2;
            if(longestPalindromeValue % 2 == 0 && value % 2 == 1) {

                longestPalindromeValue++;

            }

        }

        return longestPalindromeValue;


    }
}