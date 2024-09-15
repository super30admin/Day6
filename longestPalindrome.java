// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :first I was trying to make a hashmap and hashset, but was not able to make changes in hashset
//during iteration
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();// create a hashset
        int lengthPal = 0;
        for (int i = 0; i < s.length(); i++) {// traverse through string
            char c = s.charAt(i);
            if (set.contains(c)) {// if set already contains the character, increase palindeome length to 2
                lengthPal += 2;
                set.remove(c);
            } else {
                set.add(c);// else add in set
            }
        }
        if (!set.isEmpty()) {// at last if there is any character left, add that at last bcz palindrome can
                             // contain one single character at centre
            lengthPal++;
        }
        return lengthPal;
    }
}