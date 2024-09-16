import java.util.HashSet;
import java.util.Set;



public class Palindrome {
	public int longestPalindrome(String s) {
	    if (s == null || s.length() < 1) return 0;
	    Set<Character> set = new HashSet<>();
	    for (int i = 0; i < s.length(); i++) {
	    	System.out.println("i="+i);
	        if (set.contains(s.charAt(i))) 
	        	set.remove(s.charAt(i));
	        else 
	        	set.add(s.charAt(i));
	        System.out.println("set"+set.toString()+"i="+i);
	    }
	    if (set.size() <= 1) 
	    	return s.length();
	    return s.length() - set.size() + 1;
	    
	}
	
	public static void main(String args[])
	{
		Palindrome p=new Palindrome();
		System.out.println("size"+p.longestPalindrome("abcd"));
	}
}
