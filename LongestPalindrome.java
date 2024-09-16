class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    //Approach - Create a hash set, if an element occurs twice, it will be already in Hashset, increment result by 2
    // and remove it. We can create palindrome using even no of elements. Any odd no element can be put in the centre.
    public int longestPalindrome(String s) {
        //single-pass solution
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                result +=2;
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }

        if(!set.isEmpty()) result++;
        return result;
    }
}