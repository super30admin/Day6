
// Time complexity : O(n)O(n). The entire numsnums array is traversed only once.

// Space complexity : O(n)O(n). Hashmap mapmap can contain up to nn distinct entries in the worst case.

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int result = 0;
        boolean flag = false;
        for (Integer i : map.values()) {
            if (i % 2 == 0) {
                result += i;
            } else {
                flag = true;
                result += i - 1;
            }
        }

        return result + (flag ? 1 : 0);

    }

}