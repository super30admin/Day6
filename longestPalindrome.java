// Time Complexity : O(n) where n is the length of the string s
// Space Complexity : O(n) where n is the length of the string s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class longestPalindrome {
    public int longestPalindrome(String s) {
        if (s.length() < 2) return s.length(); 
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) set.add(c);
            else {
                ans += 2;
                set.remove(c);
            }
        }
        return set.isEmpty() ? ans : ans + 1;
    }
}