// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int longestPalindrome(String s) {
        int res=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                res+=2;
                set.remove(s.charAt(i));
            }
            else
                set.add(s.charAt(i));
        }
        if(set.isEmpty()) return res;
        return (res+1);
    }
}
