// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        
        //use set to store characters
        Set<Character> set = new HashSet();
        int ans = 0;
        for(char c : s.toCharArray()) {
            
            //if a set already contain character we found a pair
            //increment pallindrome count by 2 and remove character from set
            if(set.contains(c)) {
                set.remove(c);
                ans += 2;
            } else { // else add char to set
                set.add(c);
            }
            
        }
        
        //if set contains characters one of them can be used as a middle char in pallindrome
        return set.isEmpty()?ans:ans+1;
        
    }
}
