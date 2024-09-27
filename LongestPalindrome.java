// Time Complexity: O(n), n: length of string s
// Space Complexity: O(1)
class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return 0;
        
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(char c: s.toCharArray()) {
            if(!set.contains(c))
                set.add(c);
            else {
                set.remove(c);
                count += 2;
            }
        }
        return set.isEmpty() ? count : count+1;
    }
}