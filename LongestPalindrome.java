// Time Complexity : O(n) n is the length ofthe string
// Space Complexity : O(1) constant no of characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Use a set to track characters that we have seen before, updating the result counter.
 */

class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        int res=0;
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                res=res+2;
            }
            else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) return res+1;
        return res;
    }
}
