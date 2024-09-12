class Solution {
    // fing pair
    // set -> add new .. incoming is same remove existing add 2 in result.
    // if set not empty then add 1 in retult in end
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int result = 0;

        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (set.contains(c)) {
                set.remove(c);
                result += 2;
            } else {
                set.add(c);
            }
        }
        return set.isEmpty() ? result : result + 1;
    }
}
