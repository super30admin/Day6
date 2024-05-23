// Time Complexity : O(n)
// Space Complexity : O(1) // 26 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int out = 0;
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                out += 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            out++;
        }
        return out;
    }
}