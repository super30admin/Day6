// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Store the frequencies of character using index hash in array
// Take sum of the frequencies/2
// If there is any odd frequency we add 1 extra
// return sum*2 + single
class Solution {
    public int longestPalindrome(String s) {
        int[] charFreq = new int[124];
        Arrays.fill(charFreq,0);
        boolean single = false;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int ascii = (int)s.charAt(i);
            charFreq[ascii] +=1;
        }
        for(int i = 65; i <=123; i++){
            if(charFreq[i]%2 == 1)
                single = true;
            sum +=charFreq[i]/2; 
        }
        if(single)
            return (sum * 2 + 1);
        return sum * 2;
    }
}