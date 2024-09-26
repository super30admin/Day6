import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class LongestPalindrome {
  public static int longestPalindrome(String s) {
    int[] count = new int[256];
    for (char character : s.toCharArray())
      count[character]++;
    int finalLength = 0;
    for (int val : count) {
      finalLength += val / 2 * 2;
      if (finalLength % 2 == 0 && val % 2 == 1)
        finalLength++;
    }
    return finalLength;
  }

  public static void main(String[] args) {
    String s = "abccccdd";
    System.out.println(longestPalindrome(s));
  }
}