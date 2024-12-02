class Solution {
    public int longestPalindrome(String s) {
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else {
                map.remove(c);
                counter += 2;
            }
        }
        if (counter < s.length()) counter++;
        return counter;

    }
}