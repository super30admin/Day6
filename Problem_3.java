import java.util.HashSet;

public class Problem_3 {

	class Solution {
	    public int longestPalindrome(String s) {
	        
	        if(s.length() == 0 || s == null){
	            return 0;
	        }
	        
	        HashSet<Character> hashSet = new HashSet<Character>();
	        
	        int maxSum = 0;
	        for(int i=0; i<s.length(); i++){
	            char ch = s.charAt(i);
	            
	            if(hashSet.contains(ch)){
	                hashSet.remove(ch);
	                maxSum = maxSum + 2;
	            }else{
	                hashSet.add(ch);
	            }
	        }
	        
	        if(!hashSet.isEmpty()){
	            maxSum = maxSum + 1;
	        }
	        
	        return maxSum;
	    }
	}
}
