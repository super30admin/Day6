/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.HashSet;

class LongestPalindrome {
    public int longestPalindrome(String s) {
       if(s==null || s.length() == 0) return 0;
        HashSet<Character> hset = new HashSet<>(); 
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hset.contains(c)){
                hset.remove(c);
                count = count+2;
            }
            else{
                hset.add(c);
            }
                
        }
        if(!hset.isEmpty())
            count++;
        
        return count;       
}

public static void main(String args[]){
    LongestPalindrome obj = new LongestPalindrome();
    String s = "abccccdd";
    System.out.println("Longest Palindrome is of size: "+obj.longestPalindrome(s));
}
}