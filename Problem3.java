// Time Complexity : O(N) - One for loop for string length
// Space Complexity : O(N) - Hashset size is not declared
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Maintain hashset we dont have to map any value with charater
// if the character is hit check in the hashset. 
// if it is not present add it and if present add the count to 2 (previous character and current makes it 2)
// that means we have found the palindrome with the length 2

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> h = new HashSet<>();
        int count = 0;
        
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            
            if(!h.contains(c)){
                h.add(c);
            }else{
                count += 2;
                h.remove(c);
            }
        }
        
        return h.isEmpty() ? count :count +1;
    }
}