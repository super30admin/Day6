// Time Complexity : O(n), where n length of string
// Space Complexity : O(1), 52 characters at max in set
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0 ) return 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            }
            else {
                set.add(s.charAt(i));
            }
        } if(set.size() <= 1) return s.length();
        else{
            return s.length() - set.size() + 1;
        }
    }
}