import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                res += 2;
                set.remove(c);
            } else
                set.add(c);
        }

        if (!set.isEmpty())
            res++;

        return res;

    }
}