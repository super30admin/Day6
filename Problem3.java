// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet();
        int count = 0;
        // add to set for first occurence and add 2 to count if that char is present in set
        for(int i =0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(set.contains(ch)) {
                count += 2;
                set.remove(ch);
            } else{
                set.add(ch);
            }
        }
        // aabbc can have one extra char, longest palindrome would be abcba
        // so, if set is not empty we add 1
        if(!set.isEmpty()) {
            count += 1;
        }
        return count;
    }
}