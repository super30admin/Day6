// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
  public int longestPalindrome(String s) {
    int count = 0;
    Set<Character> set = new HashSet<>();
    // Extracting each character from the string.
    for(char c: s.toCharArray()) {
      // Checking if the set contains that character.
      if(set.contains(c)) {
        // Removing the character and incrementing count by 2.
        set.remove(c);
        count = count + 2;
      }else {
        set.add(c);
      }
    }
    // If set is not empty, incrementing count by 1.
    if(!set.isEmpty()) count++;
    return count;
  }
}