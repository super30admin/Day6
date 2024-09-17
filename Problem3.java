// Time Complexity : O(n) - n length of the input string
// Space Complexity : O(1) since using fixed array size of 62.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


// Your code here along with comments explaining your approach

/**
 * intuition: if a char is even add that to length of palindrome (can be used in either half of the array mirriring each other) else use count-1
 * and if final result after above method is even and the length of the input string is greater than this , can use one char in between the palindrome. so increase the count and return.
 */
class Solution {
    public int longestPalindrome(String s) {
        int maxlen = 0;
        int[] carr = new int[62];
        Arrays.fill(carr,0);

        for(char c: s.toCharArray()){
            carr[c-'A']++;
        }
        for(int i=0; i< 62 ; i++){
            if(carr[i]%2 == 0)
                maxlen += carr[i];
            else
                maxlen += (carr[i]-1);
        }

        if(maxlen % 2 == 0){
            if(maxlen < s.length())
                maxlen++;
        }
        return maxlen;
    }
}