/**
Leet code Submission : YES
Time Complexity : O(N)
Space Complexity : O(N)

The main idea is that palindrome will have an even number of same characters on both sides of the String if its even and if its odd sam even number and the one different character will also be there
**/

class Solution {
	public int longestPalindrome(String s) {
   	 
    	Set<Character> set  = new HashSet<Character>();
    	int count  = 0;
   	 
    	for(int i =0; i<s.length(); i++){
       	 
        	if(set.contains(s.charAt(i))){
            	set.remove(s.charAt(i));
            	count = count + 2;
        	}else{
            	set.add(s.charAt(i));
        	}
    	}
   	 
    	if(!set.isEmpty())
        	count = count + 1;
   	 
    	return count;
   	 
	}
}
