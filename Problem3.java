/* find the length of the longest palindromes that can be built with lowercase or uppoercase letters */

//Optimised solution: HashSet using 1 pass
// Time Complexity : O(N) with 1 pass (using hashset)
// Space Complexity : O(1)(space will be constant because we have 26 characters)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//We will initialise hashset and add character from string one by one
//to check if hashset already contains charater
//If element exists, we remove from hashset and add +2 to the count
//if it doesn't exist, keep adding
//at the end, increment total count by 1 if their still element exist in hashset

//Palindrome string will consists of even occurences of chars and +1 to add char in the middle
//total=even occurences of each + 1

class Solution {
    public int longestPalindrome(String s) {
        //edge case
        if(s.length() == 0) return 0;
        //initialise hashset consisting of characters
        HashSet<Character> set = new HashSet<>();
        //keeping of count of each even occurences
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count += 2;
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) count++;
        return count;
    }
}
