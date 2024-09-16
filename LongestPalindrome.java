// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        
        //Hashset to maintain unique characters
        HashSet<Character> set = new HashSet<>();
        int result = 0; //maintained counter
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); //gives the character of that particular index in the string
            if(set.contains(c)){
                result += 2; //increaments by 2 because we are maintaining the pair of characters
                set.remove(c);
            } else{
                set.add(c);
            }
        } 
        if(!set.isEmpty()) result ++; //adds one in the result because characters remained in the string will have no pair and of count one
        
        return result;
    }
}