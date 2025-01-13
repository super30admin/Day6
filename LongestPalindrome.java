import java.util.HashSet;

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach:
/*We will use  HashSet or an array to track character frequencies. 
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
       int length = 0;

       for (char c : s.toCharArray()) {
           if (set.contains(c)) {
               set.remove(c); // Pair found
               length += 2; // Add the pair to palindrome length
           } else {
               set.add(c); // Add character to set
           }
       }

       // If the set is not empty, one odd character can be added to the center
       return length + (set.isEmpty() ? 0 : 1);
   }
    
}
