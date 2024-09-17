import java.util.HashMap;

//time complexity:O(n)  as string is of length n
//Space Complexity for Longest Palindrome will be O(1) as Max space used in hashMap will be 26(lowerCase Alphabets).
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :yes syntax error for hashmap.

public class LogestPalidromeLength {
	
	  public static int longestPalindrome(String s) {
		  
		  //Declare hashmap with key as characters in string and value as no of occurances of characters.
	        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	        int length = s.length();
	       
	      //store character and its occurances in hashmap
	        for (char c : s.toCharArray()){
	            if(map.containsKey(c)) map.put(c,map.get(c)+1);
	            //if character is new then inital value is 1
	            else map.put(c,1);
	        }
	        
	        //flag to identify that string contains odd number of characters
	        boolean flag = false;
	        
	        //iterate over hashmap to check  occurance of character is even or odd. 
	        //If even no of characters then sub string can become palidromc by distributing characters at both end. so length of palidromic string is length of string.
	        //If odd no of characters then substring can become palidromic by considering one character with odd length and other character length as even (by reducing no of occurances by 1)
	        for(HashMap.Entry<Character,Integer> keyValue : map.entrySet()){
	            if(keyValue.getValue()%2!=0){
	            	//reducing length by 1 for all characters. then if value is odd then adding 1 before returning to make substring palidromic and odd value character can become center of palidromic string.
	                length--;
	                flag = true;
	            } 
	        }
	        return flag ? length+1: length;
	    }
	  
	  
	  public static void main(String[] args) {
		  String input ="abccccdd";
		  int length = longestPalindrome(input);
		  
		  System.out.println("Length of logest palidromic substring is"+length);
		  
		  
	  }

}
