//Time complexity is O(N) N is length of string
//Space complexity is O(n) n is 128
//able to submit in leetcode
class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int[] arr= new int[128];
        for(char c : s.toCharArray()){
            arr[c]=arr[c]+1;
        }
        int result = 0;
        for(int num:arr){
            result=result+(num/2)*2;
        }
        return result==n?result:result+1;
    }
}