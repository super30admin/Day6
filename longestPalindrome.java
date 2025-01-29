// Problem3 (https://leetcode.com/problems/longest-palindrome)

// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * In this problem a hash set is used to store the occurrence of the character. While I traverse through the string, if i already have the character
 * which I am at right now, increase the result by 2 and remove the character from the hashset. If not add it to hash set. After completely
 * traversing check if hash set is empty, if not add 1 to the result.Finally, return the result would give longest palindrome.
 */

 class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                result +=2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            result+=1;
        }
        return result;
    }
}