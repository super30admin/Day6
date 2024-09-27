// Time Complexity : O(n), 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package hashing2;

import java.util.*;

public class Pallindrome {

    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> charSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charSet.contains(c)) {
                count += 2;
                charSet.remove(c);
            } else {
                charSet.add(c);
            }
        }
        if (!charSet.isEmpty()) {
            count += 1;
        }
        return count;
    }
}
