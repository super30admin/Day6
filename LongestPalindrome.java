// Time Complexity : O(n)
// Space Complexity : O(n); n = len of string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);
                int x = map.get(c);
                //if (x % 2 == 0) {
                len += x;
                // }
                map.remove(c);
            }
            else {
                map.put(c, 1);
            }
        }

        if (!map.isEmpty())
            len += 1;


        return len;
    }
}