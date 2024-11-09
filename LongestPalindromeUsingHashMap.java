/*
Time Complexity: O(n), where n is the length of the input string.
Space Complexity: O(1), due to the fixed number of possible characters in the HashMap.

Did this code successfully run on Leetcode : Yes
 */

import java.util.HashMap;

class LongestPalindromeUsingHashMap {
    public int longestPalindrome(String s) {

        //Integer for storing the frequency of the character
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, (map.getOrDefault(c,0)+1));
        }

        int count = 0; //to keep a track of length
        boolean flag = false; //becomes true when freq is odd

        for(char c: map.keySet()) {
            int freq = map.get(c);

            if(freq%2 == 0) { //freq even check
                count += freq;
            }
            else { //freq is odd
                flag = true; //encountered odd character
                count += freq-1; //minus one to choose even freq
            }
        }

        if(flag) return count+1; //if flag is true, odd characters present

        return count;
        /*this is if only even charaters are present, so need to add one, also point to note is even if we encounter multiple odd characters,
        we will only be adding count by 1 as we can only have 1 odd character in middle of string to make it a palindrome. If we add more meaning
        more than 1 odd characters in middle of string, the string will no longer be a palindrome eg: aabcnbaa => not a palindrome as "cn" two
        characters in middle
        */
    }
}