// TC: O(n)
// SC: O(n)
// Solved on Leetcode
// No problems faced

class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        
        for (char c: s.toCharArray()) {
            if(set.contains(c)) {
                length += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        return set.isEmpty() ? length: length + 1;
    }
}
