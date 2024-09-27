// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
 * 1. Here we use the count to keep a track of the elements that come into the array.
 * 2. Each and every time a new character comes into the array, we increment the count of the respective element in set.
 * 3. When the count reaches to two, we increment the return value by two and reset the char count to zero. 
 *    Since the char count is 2, we can form a palindrome using that char.
 * 4. Finally if there are elements in the set, 
 *    we can increment the result count by 1 since one char can be used as the middle element of the palindrome.
 *  
*/

import java.util.HashSet;

class LongestPalindrome {
    public static int longestPalindrome(String s) {
        if(s == null || s.isEmpty()) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        
        if(!set.isEmpty()) count++;
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("bb"));
    }
}