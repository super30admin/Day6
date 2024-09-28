// Time Complexity : O(n) where n is the length of String s
// Space Complexity : O(1) since there can be only 26/52 character occurrences atmost
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(int i=0;i<s.length();i++){
        
        // Remove char if already exits and add +2 to count
            if(set.contains(s.charAt(i))){
                count += 2;
                set.remove(s.charAt(i));
            }
            
        // Else add character to set
            else set.add(s.charAt(i));
        }
        
        // If set is not empty add the flag element i.e. middle single element
        if(!set.isEmpty()) count++;
        return count;
    }
}
