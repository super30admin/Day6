// Approach 1 - Using HashMap
// TC: O(N), where N is the number of numbers in array "nums"
// SC: O(1)
// ####################################################################################
// Approach 2 - Using HashSet
// TC: O(N), where N is the number of numbers in array "nums"
// SC: O(1)


import java.util.*;

// Approach 1 - Using HashMap
class LC409HashMap {
    public int longestPalindrome(String s) {
        int n = s.length();
        int rem = 0;
        int dualChars = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.computeIfPresent(c, (k, v) -> (v + 1));
            map.putIfAbsent(c, 1);
        }
        for (int val : map.values()) {
            dualChars += val / 2;
            rem += val % 2;
        }

        return 2 * dualChars + (rem > 0 ? 1 : 0);
    }
}

// Approach 2 - Using HashSet


class LC409HashSet {
    public int longestPalindrome(String s) {
        int n = s.length();
        int dualChars = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                dualChars += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return dualChars + (set.size() > 0 ? 1 : 0);
    }
}