class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hashSet.contains(ch)) {
                result = result + 2;
                hashSet.remove(ch);
            } else {
                hashSet.add(ch);
            }
        }
        if (!hashSet.isEmpty()) {
            result++;
        }
        return result;
    }
}