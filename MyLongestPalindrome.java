import java.util.HashSet;

/*******
## Problem3 (https://leetcode.com/problems/longest-palindrome)

Time Complexity :   O (n) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (409. Longest Palindrome)
Any problem you faced while coding this :       No
*******/

class MyLongestPalindrome {
    public int longestPalindrome(String s) {
        int count = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            
            if (! set.contains(c)){
                set.add(c);
            }
            else{
                set.remove(c);
                count = count + 2;
            }
        } 
        if (!set.isEmpty()){
            count++;
        }
        return count;
    }

    public static void main(String args[]) 
    { 
        MyLongestPalindrome obj = new MyLongestPalindrome();
        String s = "abccccdd";
        System.out.println(obj.longestPalindrome(s));
    }
}
