// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Solution {
    public int longestPalindrome(String s) {
        // base case
        if (s == null || s.length() == 0)
            return 0;
        HashSet<Character> hset = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // if character already seen remove and increase count
            if (hset.contains(s.charAt(i))) {
                hset.remove(s.charAt(i));
                count++;
            } else {
                hset.add(s.charAt(i));
            }
        }
        // to add the odd value if length can be odd size
        if (!hset.isEmpty())
            return count * 2 + 1;
        return count * 2;
    }
}