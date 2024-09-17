// Time Complexity : O(n) 
// Space Complexity : O(n) worst case we have to store every number
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I was stuck initally becasue I didnt add the base case (0,1) to map


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int result = 0;
        
        for(char c: s.toCharArray())
            count[c]++;
        
        for(int val: count){
            result += (val/2) * 2;
            if(result%2==0 && val%2==1)
                result += 1;
        }
        return result;
    }
}