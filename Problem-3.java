// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                count +=2;
            }
            else {
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) {
            count ++;
        }
        return count;
    }
}
