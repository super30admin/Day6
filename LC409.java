// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


class Solution {
    public int longestPalindrome(String s) {
        
        //start with count=0
        int count = 0;
        
        //initialize a hashset to keep track of the characters which can make palindrome string
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            //if set contains the character, increment count by 2 and remove that character from the set
            if(set.contains(ch)){
                count += 2;
                
                set.remove(ch);
            }
            //else just add the character
            else{
                set.add(ch);
            }
        }
        
        //if set is empty just return the count, else add 1 to count because we can still fit one character in the middle of the string to make it longest palindrome
        return set.isEmpty() ? count : count + 1;
    }
}