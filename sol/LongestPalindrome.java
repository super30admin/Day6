import java.util.HashSet;

public class LongestPalindrome {
	 public int longestPalindrome(String s) {
	       
		 
	        
	     HashSet<Character> hs=new HashSet<>();
	        
	    int count=0;
	        
	        
	        for(int i=0;i<s.length();i++){
	           
	            char a=s.charAt(i);
	            
	            if(hs.contains(a)){
	                
	                hs.remove(a);
	                count=count+2;
	            }
	               
	               else{
	                
	                hs.add(a); }
	            
	         }
	        
	    if(hs.isEmpty()){return count;}else{return count+1;}     
	}
	              
	  
}
