// Time Complexity :O(n)
// Space Complexity : O(1), as we only have 26 characters
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        // a -> 1
        // b- > 1
        // c - 4
        // d - 2

        if (s == null || s.length() == 0)
            return 0;

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
            } else {
                set.remove(c);
                count += 2;
            }
        }
        if(!set.isEmpty()){
            return count + 1;
        }
        return count;

    }
}