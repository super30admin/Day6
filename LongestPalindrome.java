/**
 * time complexity : O(n)
 * space complexity : O(k) <--length of string worst case;
 * leetcode : successfull
 * steps :  for every char in String check if char exists in hashset, if so increment count by 2 and remove element from set as 
 *           a result count is calculated perfectly for even chars. once loop finishes check for emptiness of set, if it's not empty increment
 *          count by 1 and return count. 
 */

import java.util.HashSet;

class LongestPalindrome {

    public int palindrome(String s){
        if(s==null||s.length()==0) 
            return 0;
        
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c))
                {count += 2;
                set.remove(c);}
            else 
                set.add(c);
        }
        if(!set.isEmpty()) count++;
        return count;
    }

    public static void main(String[] args) {
        LongestPalindrome lp =new LongestPalindrome();
        int i = lp.palindrome("dddddfffgghhalk");
        System.out.println(i);
    }
}