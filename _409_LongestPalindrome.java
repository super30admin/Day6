package com.javadwarf.hashtable.leetcode;

public class _409_LongestPalindrome {

	public static void main(String[] args) {

	}
	//Time o(n) and space o(1)
	public int longestPalindrome(String s) {
        
        int[] arr = new int[256];
        
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - '\0']++;
        }
        
        int len = 0;
        boolean flag = true;
        
        for(int i=0; i<256; i++){
            
            len += (arr[i]/2)*2;
            
            if(flag && arr[i]%2 != 0){
                len++;
                flag = false;
            }
        }
        
        return len; 
    }

}
