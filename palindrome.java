// Time Complexity : O(n) -- n is the length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int longest = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c))
            {
                longest += 2;
                set.remove(c);
              }
            else{
                set.add(c);
            }
        }
        if(set.isEmpty()){
            return longest;
        }
        else{return longest+1;}
}
}