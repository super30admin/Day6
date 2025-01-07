/*
    Leetcode problem 409: Longest Palindrome
    T.C: O(n) :: S.C: O(n)

    Solved using a HashMap that stores each character of the string as key
    and its occurrences as value. All even values can be summed up to make
    a palindrome (i.e a even number 2 can build a balanced string by placing
    it in the first and last positions) and odd occurrences can be later considered
    to complete the longest palindrome that can be formed by the given string.
*/

class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> charOccMap = new HashMap<>();
        int longest = 0;
        //Initialize the HashMap with char and occ 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            charOccMap.put(c, charOccMap.getOrDefault(c, 0) + 1);
        }
        //Check for odd occurrence
        boolean flag = false;
        //Iterate of the hashmap and sum up to the longest
        for (char key: charOccMap.keySet()) {
            if (charOccMap.get(key) % 2 == 0) { //Even occ
                longest += charOccMap.get(key);
            } else { //Odd occ
                longest += charOccMap.get(key) - 1;
                flag = true; //add as a even no. and set flag
            }
        }

        if(flag) { //finally add the odd occ if flag is true
            longest++;
        }

        return longest; //return the result
    }
}