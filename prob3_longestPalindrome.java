// Time Complexity : O(n) (n- length of string)
// Space Complexity : O(1) (total alphabets)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : n/a
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(set.contains(c))
                set.remove(c);
            else
                set.add(c);
        }
        if(set.size()>=1)
            return s.length() - set.size() + 1; //the set might have some remaining elements so we subtract the length of set from s and add 1 as there can be one element in the middle of a string and the string will still be a palindrome
        else
            return s.length(); // if set has zero elements, then whole of s is a palindrome
    }
}