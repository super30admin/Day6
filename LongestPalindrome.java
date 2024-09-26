// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


class Solution {
    public int longestPalindrome(String s) {
        if(s==null|| s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;

        int[] alpha=new int[128];
        int max_length=0;
        for(char c:s.toCharArray()){
            alpha[c]++;
            if(alpha[c]==2)
            {
                max_length+=2;
                alpha[c]=0;
            }
        }
        if(s.length()>max_length)
            return max_length+1;
        else
            return max_length;

    }
}

