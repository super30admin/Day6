
class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        /*
         * Time Complexity: O(n) to iterate over the string
         * Space Complexity: O(1) since the characters will be 26 small and 26 large in worst case and total of 52 which if fixed which would be stored in the HashSet
         *
         *
         */
        
        if (s.length() == 0) return 0;
        
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int i=0; i<s.length(); i++) {                        
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                result += 2;
            } else {
                set.add(s.charAt(i));
            }
        }
        
        if (!set.isEmpty()) {
            result++;
        }
        
        return result;
    }
}
