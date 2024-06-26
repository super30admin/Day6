/*
TC --> O(n)
SC --> O(1)
 */
import java.util.*;

class Solution {

    public int longestPalindrome(String s) {
        HashSet<Character> data = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (data.contains(s.charAt(i))) {
                data.remove(s.charAt(i));
                count += 2;
            } else {
                data.add(s.charAt(i));
            }

        }//for

        if (data.size() > 0) {
            count += 1;
        }
        return count;

    }
}
