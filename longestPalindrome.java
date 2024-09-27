//TC SP-- O(1) --- Verify
class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return 0;

        int count = 0;

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                set.remove(c);
                count = count + 2;
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) {
            count = count + 1;
        }
        return count;
    }
}