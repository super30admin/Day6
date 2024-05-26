// Time Complexity : O(1) => Assuming k is the length of each word in the string and we are travesing through the each word of length k and there are total n words so TC will be O(nk)
// Space Complexity : O(1) => Constant space compleexity as we are not utizlizing additional space. If we only consider lowercase then max size will be 26.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Using HashSet and a counter variable, we can check if that character already exists in the set it indicates we have found a matching character (i.e. 2 same characters),
then simply add 2 to the counter (2 to indicates there are 2 char). If match not found simply add to the set. In case of odd length of palindrome we can add any 1 char so check if set in not
empty add 1 to the counter
 */
class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return -1;
        }

        HashSet<Character> palindromeSet = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (palindromeSet.contains(c)) {
                counter = counter + 2;
                palindromeSet.remove(c);
            } else {
                palindromeSet.add(c);
            }
        }

        //In case of odd length of palindrome we can place the character in between
        if (!palindromeSet.isEmpty()) {
            counter = counter + 1;
        }
        return counter;
    }

}