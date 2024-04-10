// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
    public int longestPalindrome(String s) {
        if(s == null) return 0;
        if(s.length() == 0) return 0;
        int count = 0;;
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(set.contains(c)) {
                set.remove(c);
                count += 2;
            }else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) return count+1;
        return count;
    }
}