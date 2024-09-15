// Time Complexity: O(n)
// Space Complexity: O(n) 

// Approach: Create a hashset and input the first occurence of a char from string s.
// If the char already exists, remove it from set and increment the count.
// After iterating through the entire string, check if hashset is empty.
// If hashset is empty, return count*2, else return count*2 + 1

//Leetcode: 409, LongestPalindrome

import java.util.*;

public class LongestPalindrome {
  public int longestPalindrome(String s) {
    if (s.length() == 1) {
      return 1;
    }

    int count = 0;

    HashSet<Character> set = new HashSet<>();
    for (char ch : s.toCharArray()) {
      if (set.contains(ch)) {
        count++;
        set.remove(ch);
      } else {
        set.add(ch);
      }
    }

    if (set.isEmpty()) {
      return count * 2;
    }

    return (count * 2) + 1;
  }
}