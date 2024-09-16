// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    For every element in the String , we add it to the set.
    If it already existed in the set, we remove it from the set.
    The logic being the pair for that element has been found.
    In the end, we subtract the (size of the set - 1) from the original string.
    (-1) signifying that there could be a maximum of one element in between.  
*/

class Solution {
    public int longestPalindrome(String s) {
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < s.length(); i++) if (!set.add(s.charAt(i))) set.remove(s.charAt(i));
            return s.length()-Math.max(set.size()-1, 0);
    }
}