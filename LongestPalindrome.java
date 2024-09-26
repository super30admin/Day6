// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return 0;
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            if(set.contains(sChar)){
                result = result + 2;
                set.remove(sChar);
            }
            else
                set.add(sChar);
        }
        if(set.size() > 0)
            result++;
        return result;
    }
}
