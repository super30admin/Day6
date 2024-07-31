// Time complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach: Maintain a hashmap with (character, count of it). After that, we can consider all even characters to form a palindrome.
//We can also take oddcount by removing 1 to form a palindrome. Finally we take any one character from the odd counts.


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> characterCount = new HashMap<>();
        int length = 0;
        boolean hasOdd = false;
        for(int i=0;i<s.length();i++) {
            if(characterCount.containsKey(s.charAt(i))) {
                characterCount.put(s.charAt(i),characterCount.get(s.charAt(i)) + 1);
            } else {
               characterCount.put(s.charAt(i),1); 
            }
        }
        for(int entry: characterCount.values()) {
            if(entry % 2 == 0) {
                length+= entry;
            }
            else{
                length+= (entry-1);
                hasOdd = true;
            }
        }
        if(hasOdd) length = length + 1;
        return length;
    }
}