/** Longest Palindrome */
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class Solution {

  public int longestPalindrome(String s) {
    if (s == null || s.length() == 0) return 0;
    Set<Character> set = new HashSet<>();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      // true if this set did not already contain the specified element
      if (!set.add(c)) {
        set.remove(c);
        count += 2; // if the element is already present, we know it has occurred twice. so we add +2 to the count
        //two same alphabets is a palindrome like aa
      }
    }
    //after taking out the even numbered alphabets from the set, if we are remaining with any elements
    //we can take 1 element to form a odd length palindrome
    return count + (set.size() > 0 ? 1 : 0);
  }
}
