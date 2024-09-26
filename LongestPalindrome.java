// Time Complexity : O(n) since we have to traverse the entire string length
// Space Complexity :O(n) where n is the string length , and all the characters are just once
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        // base case
        if (s == null || s.length() == 0)
            return 0;

        HashSet<Character> hs = new HashSet<>();

        int count = 0;

        for (char ch : s.toCharArray()) {

            // if the count is odd add it to the hashset if we are seeing it for the second
            // time, remove it and increase the counter
            if (hs.contains(ch)) {
                hs.remove(ch);
                count++;
            } else
                hs.add(ch);
        }

        // if hashset still has an element that it means it has occurence =1 and hence
        // we can have an odd length palindrome
        if (hs.isEmpty())
            return 2 * count;
        else
            return 2 * count + 1;

    }
}