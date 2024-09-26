// Time Complexity : O(n) iterate over the elements of the String.
// Space Complexity : O(n) worst case
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hSet.contains(c)) {
                hSet.remove(c);
                count = count + 2;
            } else {
                hSet.add(c);
            }

        }
        if (!hSet.isEmpty()) {
            return count + 1;
        }
        return count;

    }
}