/**
 * // Time Complexity : O(n)
 * // Space Complexity : O(n)
 * // Did this code successfully run on Leetcode : yes
 * // Any problem you faced while coding this : no
 *
 * // Your code here along with comments explaining your approach
 */
class LongestPalindrome {
    public static int longestPalindrome(String s) {

            HashSet<Character> set = new HashSet<>();
            int count =0;
            for(char c: s.toCharArray()){
                if(!set.contains(c)){
                    set.add(c);
                }else{
                    count+=2; // +2 because at this point in time we are only taking in a pair and then removing it.
                    set.remove(c);
                }
            }
            if(!set.isEmpty()) count++; // this count++ to consider a character that is left to put in the middle of the palindrome

            return count;
    }


}
