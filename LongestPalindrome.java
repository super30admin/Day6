// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
      int count = 0;
      Set<Character> set = new HashSet<>();
      for(char c: s.toCharArray()) {
        if(set.contains(c)) {
          set.remove(c);
          count = count + 2;
        }else {
          set.add(c);
        }
      }
      if(!set.isEmpty()) count++;
      return count;
    }
  }