// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/*
    We add characters to a set, if we encounter the character again, we remove it from the set.
    After for loop ends, if set size is 0, it means we can create a palindrome of size s.length. ( we have even no. of characters)
    Otherwise, we can create a palindrome of size str length - size of set +1.
*/

class Solution {
    public int longestPalindrome(String s) {
         if (s == null || s.length() < 1) return 0;
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
        if (set.contains(s.charAt(i))) set.remove(s.charAt(i));
        else set.add(s.charAt(i));
    }
    if (set.size() < 1) return s.length();
    return s.length() - set.size() + 1;
    }
}