// Time Complexity : O(n)
// Space Complexity : O(1), wont go above 26 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nO

/* Approach:   */

class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return -1;
        }  // base case if nothing is there

        HashSet<Character> map = new HashSet<>();
        int count = 0; // initialising count to 0
        
        for(int  i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.contains(c)){ // check to see if hashset already contains
                count = count + 2; // increment count
                map.remove(c); // remove from the map as we have already counted it
            }else{
                map.add(c); 
            }
        }
        if(map.isEmpty()){
            return count; // even palindrome
        }else{
            return count + 1; // +1 because if there is something in the hashset, we can form an odd palindrome
        }
    }
}