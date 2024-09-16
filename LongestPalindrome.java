//Time complexity : O(n)
//Space complexity : O(1) (constant character)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public int longestPalindrome(String s) {
      //null case
      if(s.length() == 0 || s == null) {
        return 0;
      }
    
      int count = 0;
      //hash set to store the encountered char
      HashSet<Character> set = new HashSet<>();
      for(int i=0;i< s.length();i++) {
        char c = s.charAt(i);
        if(!set.contains(c)) {
          set.add(c);
        } else {
          //if char is in set remove and increase the count
          set.remove(c);
          count += 2;
        }
      }
      // add a letter to to the total count 
      if(!set.isEmpty()) {
        count += 1;
      }
      
      return count;
    }
}