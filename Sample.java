// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


// Hashing longest palindrome

// Time complexity:O(n)
// Space complexity: constant time
class Solution {
    public int longestPalindrome(String s) {

        int max=0;
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i =0;i<s.length();i++) {
            if (!count.containsKey(s.charAt(i)))  {
                count.put(s.charAt(i), 1);
            } else {
                max=max+2;
                count.remove(s.charAt(i));
            }
        }
        if (!count.isEmpty()) {
            max = max +1;
        }
        return max;
    }
}
