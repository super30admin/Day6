// Time complexity : O(N) when N = length of the input string
// Space complexity: O(1) cause the hash set can have maximum odd occurences of 26 lower case characters only
class Solution {
    public int longestPalindrome(String s) {

        // Base case for empty string
        if (s == null || s.length() == 0) return 0;

        HashSet<Character> theSet = new HashSet<Character>();
        int len = 0;

        char [] sArray = s.toCharArray();

        for(char c: sArray) {
            if(theSet.contains(c)) {
                len += 2;
                theSet.remove(c);
            } else {
                theSet.add(c);
            }
        }
        if (theSet.size() > 0) len += 1;
        return len;
    }
}