// Time Complexity : O(n) where n is the length of the string s
// Space Complexity :O(1) or constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> h = new HashSet<>(); // Hashset to track occurences of pairs of characters
        int count=0;
        for(char t : s.toCharArray() )
        {
           if(h.contains(t))  // means that the character has occured already once ie we have a pair
           {
               count+=2;   // incremented by 2 cause we have a pair
               h.remove(t);  // remove the character pair cause we already counted it
           }
        else
            h.add(t);
        }
        if(!h.isEmpty())  // After all pairs have been removed if there is a single element left, it can be put in the center
            count++;
        return count;
       }
}