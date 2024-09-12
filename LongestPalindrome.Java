
// Time Complexity : O(n)
// Space Complexity : O(1)   // O(26)  constant count of alphabets
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
       int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            
            if(set.contains(sChar)){
                count += 2;
                set.remove(sChar);
            }
            else{
                set.add(sChar);
            }
            
            
        }
        if(!(set.isEmpty())) count ++;
        return count;
    }
}