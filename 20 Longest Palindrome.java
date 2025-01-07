// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        //aesha
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(char c: s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }else{
                set.remove(c);
                count+=2;
            }
        }
        if(!set.isEmpty()){
            count ++;
        }
        return count;
    }
}