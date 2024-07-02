// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0|| s==null)
        {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(char c:s.toCharArray())
        {
            if(!set.contains(c))
            {
                set.add(c);
            }
            else
            {
                set.remove(c);
                count+=2;
            }
        }
        
        return set.size()==0?count: count+1;
    }
}