// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Knowing to use  a hash map to reduce run time as a first try at a solution. 

// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> charCounts = new HashSet<>();
        int totalCount = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charCounts.contains(c)){
                charCounts.remove(c);
                totalCount += 2;
            }else{
                charCounts.add(c);
            }
        }
        
        return (charCounts.isEmpty()) ? totalCount : ++totalCount;
    }
}