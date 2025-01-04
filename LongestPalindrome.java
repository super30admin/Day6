/* Description: Looping through every character and storing it in hashset if occurred once. Whenever any character 
is occuring twice we are adding 2 to the cnt variable and removing the character from set. So, at the end if there is 
something in set that means that has occurred only once and we can add 1 to the cnt. Return cnt
 */
// Time Complexity : O(n)
// Space Complexity : O(1) - Because even using hashset, the characters cannot go beyond 52(lower + upper)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach:
import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        // Checking base condition
        if (s == null || s.length() == 0) {
            return 0;
        }
        // Checking base condition, single character in string is also a palindrome
        if (s.length() == 1) {
            return 1;
        }
        // Initializing cnt to 0
        int cnt = 0;
        // Initializing set to store the character
        HashSet<Character> set = new HashSet<>();
        // Looping through each character in string
        for (int i = 0; i < s.length(); i++) {
            // Getting single char from string
            char c = s.charAt(i);
            // Checking if set contains that char
            if (set.contains(c)) {
                // Yes than incrementing the cnt by 2
                cnt = cnt + 2;
                // And removing that char from set
                set.remove(c);
            } else {
                // Else adding that char into set
                set.add(c);
            }
        }
        // At the end, is set not empty, increment cnt by 1
        if (!set.isEmpty()) {
            cnt++;
        }
        // Return cnt
        return cnt;
    }
}