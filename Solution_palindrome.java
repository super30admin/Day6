/*

Time Complexity: O(n) where n is length of the string.
Space Complexity :  O(n) where n is the size of the hashmap.

*/

import java.util.*;

public class Solution_palindrome {

    public int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int res = 0;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            res += map.get(c) / 2 * 2;
        }

        return res == s.length() ? res : res + 1;

    }

}
