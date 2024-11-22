// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int count= 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
            }else{
                set.remove(c);
                count+=2;
            }
        }
        count = set.isEmpty()?count:count+1;
        return count;
    }
}