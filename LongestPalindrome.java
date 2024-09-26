// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                res = res + 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        return set.isEmpty() ? res : res +1;
        
    }
}