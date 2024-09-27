//time o(n) where n is the length of the string
//space o(1) set will have fixed size

import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        if (s.length() <= 0)
            return 0;
        Set<Character> set = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                counter += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if (!set.isEmpty())
            counter++;
        return counter;
    }
}