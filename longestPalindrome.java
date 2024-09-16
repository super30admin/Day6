import java.util.HashSet;

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        //bases cases in case the string is empty 
        if(s.length() == 0 || s == null)
            return 0;
        
        Set<Character> set = new HashSet<>();

        //will keep track of the max length of palindrome
        int count = 0;
        
        for(char c: s.toCharArray()){
            //if the set does not have the char yet, we insert it
            if(!set.contains(c))
                set.add(c);
            //char already exists so we remove it and add 2 to the count
            else{
                count += 2;
                set.remove(c);
            }
        }
        //if the set is empty, we can only use the pairs and if there are extra letters we can use one in the middle of word
        return set.isEmpty() ? count : count + 1;
    }
}