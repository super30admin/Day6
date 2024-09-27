// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count += 2;
            }
            else
                set.add(c);
        }
        return set.isEmpty()?count:count + 1;
    }
}