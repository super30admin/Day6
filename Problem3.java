// Time Complexity :O(N)
// Space Complexity : O(M), M = Number of Characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
Using HashSet. Couting frequency of each element and adding to the count and if there are any odd integers count+1 and return

class Solution {
    public int longestPalindrome(String s) {
          if(s == null || s.length() ==0) return 0;
        HashSet<Character> set = new HashSet<Character>();
      
        int count = 0;
        for(int i =0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(set.contains(c))
            {
                set.remove(c);
                count+=2;
            }
            else
            {
                set.add(c);
            }
        }
        count = set.isEmpty() ? count: count +1;
        return count;
    }
}
