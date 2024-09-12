// Time Complexity O(n) - Number of characters
// Space Complexity O(1) - Constant character of 26.
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        
        for(Character c : s.toCharArray()) {
            if(set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        
        return set.size() == 0 ? s.length() : s.length() - set.size() + 1;
    }
}
