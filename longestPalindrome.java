// Time Complexity : O(N)
// Space Complexity : 0(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none

class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length()==0) return 0; // Check is the string provided is null or empty. If yes, then return 0
        int count = 0;
        HashSet<Character> map = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            char a = s.charAt(i); //take character by character
            if(map.contains(a)){ // check if that is present in the hashmap
                count += 2; //if yes then add 2 to the count
                map.remove(a); // and remove the character from the hashmap
            }else{
                map.add(a); // if the character is not present in the hashmap, then add that character to the hashmap
            }
        }
        if(!map.isEmpty()) count +=1; // In end check if hasmap is empty or not. If it is not then add 1 to the count
        return count; // as a result return count.
        
    }
}