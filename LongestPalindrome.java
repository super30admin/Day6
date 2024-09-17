// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Longest palindrome can be found by keeping a track of the frequencies of the occurrences of each character. Since a palindrome 
// will contains even number of characters of similar type with an exception of the central character, we can use a HashSet rather than a
// map to capture this behavior. Whenever a new element is found, its added to the set. Whenever a seen character is found again, it is 
// removed from the set aand the count is incremented by 2.

import java.util.*;
class LongestPalindrome {
    public int longestPalindrome(String s) {
        //edge case
        if(s.length() == 0) return 0;
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count += 2;
            }
            else {
                set.add(s.charAt(i));
            }
        }
        return set.size() > 0 ? count+1 : count;
    }
}