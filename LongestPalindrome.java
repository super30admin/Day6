
/**
 * Time Complexity: O(n) where n is the length of the string.
 * Space Complexity: O(1)
 * 
 * Approach: We use a hashset of keep track of repeatitve characters.
 * If the character is not found in hashset, we add it.
 * If the character is found, we add 2 to the current count and remove the element from the set.
 * If at the end of iteration the set is not empty, we add 1 to the count. This indicates
 * that there is an odd length string since we can use 1 character atmost to create a palindrome string.
 */

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

  public int longestPalindrome(String s) {
    if (s == null || s.length() == 0) {
      return -1;
    }
    int count = 0;
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (set.contains(c)) {
        count = count + 2;
        set.remove(c);
      } else {
        set.add(c);
      }
    }
    if (!set.isEmpty()) {
      count++;
    }
    return count;
  }
}
