package Hashing2;

import java.util.HashSet;

public class LongestPalindrome {
	 public int longestPalindrome(String s) {
	        if(s.length()==0 || s==null) return 0;
	        int count=0;
	        HashSet<Character> hset =  new HashSet<Character>(); 
	        for(int i=0;i<s.length();i++){
	            char c=s.charAt(i);
	           if(hset.contains(c)){
	               count +=2;
	               hset.remove(c);
	           }
	            else{
	                hset.add(c);
	            }
	        }
	        if(!hset.isEmpty()) count+=1;
	        return count;
	    }

}
