/* Problem:
409. LONGEST PALINDROME
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */


// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
Used HashSet to store each character and if it already exists in set we are popping it out. (Implies it is repeating twice)
we increment the counter for every removal and return count*2 if set is empty after looping through whole String
else if any elements left we can consider one element as a middle one to form a palindrome hence return count*2+1;
*/

class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                count++;
            } else
                set.add(c);
        }
        return set.isEmpty() ? count * 2 : count * 2 + 1;

    }
}