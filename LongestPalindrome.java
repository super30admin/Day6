// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
       
    Set<Character> set = new HashSet();
    int length = 0;
    for(char c: s.toCharArray()){
        if(set.contains(c)){
        length +=2;
        set.remove(c);
        }
        else{
            set.add(c);
        }
    }
        return set.size() > 0 ? length+1 : length;
    }
}