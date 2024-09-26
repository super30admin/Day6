import java.util.HashSet;

class Solution {
    /*
     * Time - O(n) where n is the length of the string s
     * Space - O(n)
     * 
     * Approach - Use hashset to pair up characters and remove, 
     * if there are characters left at the end in the hashset, 
     * add 1 to count and return. 
     */
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if (!set.isEmpty()) count++;
        return count;
    }
}