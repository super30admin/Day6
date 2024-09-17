// Time Complexity : O(n)
// Space Complexity : O(1) as chars will be uppercase and/or lowercase which is fixed and not depedant on input.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * In order for a char to be a part of palindrome, its occurence should be even.
 * and we can use one of the chars whose occurence is odd, if present any.
 * So to keep a count, we use HashSet.
 * For every char in string s, we check if hashset already has that char present
 * If yes, we remove that char from hashSet and add 2 to len variable as now its count will be 2 which is even.
 * Else we add current char to HashSet as first occurence
 * This way we form length of palindrome which can be form by all even occurent chars.
 * Now if any char is present in hashset then those are chars whose count is odd and we use one of them in our palindrome.
 * so before returning the len, we check if hashset is empty or not.
 * If hashset is empty, there are no odd occurent chars.
 * But if hashset is not empty, then there are 1 or more odd occurent chars, so we add 1 to our len variable
*/


class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> chars = new HashSet<>();
        int len = 0;
        
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(chars.contains(ch) == false)chars.add(ch);
            else{
                len = len + 2;
                chars.remove(ch);
            }
        }
        
        if(chars.isEmpty() == false)len++;
        return len;
    }
}