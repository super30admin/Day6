// Time Complexity : O(n) where n is length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        //edge
        if(s == null || s.length() == 0) return 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count = count + 2;
            }else {
                set.add(c);
            }
        }if(!set.isEmpty()) count++;
        return count;
    }
}