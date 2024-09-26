// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> counterSet = new HashSet<>();
        int retCount = 0;
        for(Character c : s.toCharArray())
        {

            if(counterSet.contains(c)) {
                counterSet.remove(c);
                retCount += 2;
            } else {
                counterSet.add(c);
            }

        }

        if(counterSet.isEmpty() == false) {
            retCount++;
        }

        return retCount;
    }
}