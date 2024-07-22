/**
TimeComplexity: O(N)
SpaceComplexity: O(N)
**/

class Solution {
    public int longestPalindrome(String s) {

        Set<Character> charSet = new HashSet<Character>();
        int count = 0;
        for(int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            if(!charSet.contains(c)) {
                charSet.add(c);
            } else {
                charSet.remove(c);
                count = count + 2;
            }
        }

        if(!charSet.isEmpty()) {
            count++;
        }
        return count;
    }
}
