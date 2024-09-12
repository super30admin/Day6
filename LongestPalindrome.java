// Time Complexity : O(N) where N is length of inout string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

public class LongestPalindrome {

    public static void main(String args[]) {
        System.out.println(fildLongestPalindrome("abccccdd"));
    }

    public static int fildLongestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int[] charMap = new int[100];
        
        for(char c : s.toCharArray()){
            int idx = c - 'A';
            charMap[idx] ++;
        }
        boolean oneUnmatched = false;
        int count = 0;
        
        for(int i=0; i<charMap.length; i++){
            int freq = charMap[i];
            if(freq % 2 != 0 ){
                if(!oneUnmatched){
                    oneUnmatched = true;
                    count += freq;
                }else{
                    count += freq - 1;
                }
            }else{
                count += freq;
            }
        }
        return count;
    }
    
}
