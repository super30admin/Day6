/*
Time Complexity : O(n)
Space Complexity : O(100) constant space
*/ 
class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[100];
        for(char ch : s.toCharArray()){
            arr[ch-' ']++;
        }
        int count = 0;
        for(int i=0;i<100;i++){
            count += (arr[i]/2)*2;
        }
        if(s.length()>count){
            return count+1;
        }
        return count;
    }
}