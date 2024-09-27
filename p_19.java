// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approachimport java.util.HashSet;

class Solution {
  public int longestPalindrome(String s) {
      HashSet<Character>set = new HashSet<>();
      int result = 0;
      for(int i = 0; i < s.length(); i++){
          char c = s.charAt(i);
          if(set.contains(c)){
              result += 2;
              set.remove(c);
          }else{
              set.add(c);
          }
      }
      if(!set.isEmpty()) result++;
      return result;
  }
}
