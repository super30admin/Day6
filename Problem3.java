/*
    LC - 409 Longest Palindrome
    TC - O(n)
    SC - O(1)
    Did this code successfully run on Leetcode : Yes
    Approach - Using hashset, we can check if the element contains in it and count the even number of element also remove once the even number found and add if it didnt exist.
    add 1 at the end if set is not empty which indicates that there is odd count of element exist and return the count
*/

class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                cnt = cnt + 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) {
            cnt = cnt + 1;
        }
        return cnt;
    }
}