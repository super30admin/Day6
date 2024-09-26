package secondWeek;

import java.util.HashSet;

public class LongestPalin {

	
	    public int longestPalindrome(String s) {
	        
	        int count =0;
	        if(s.length() == 0) return -1;
	        HashSet<Character> set = new HashSet<>();
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            if(set.contains(c)){
	                count+=2;
	                set.remove(c);
	            } else {
	                set.add(c);
	            }
	           
	        }
	         if(!set.isEmpty()){
	                count++;
	            }
	        return count;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestPalin pa = new LongestPalin();
		
		System.out.println(pa.longestPalindrome("abcccdd"));
	}

}
