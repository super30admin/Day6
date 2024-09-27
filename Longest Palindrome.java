// Time Complexity : O(n) n is length of the string.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Create a Hashset and iterate over the string. For every character if the 
// character is present in HashSet remove it and increment the longest by 2. If 
// the character is not present just add it to the HashSet. Finally check if 
// HashSet is empty and in case of no elements present just return the longest
// otherwise increment longest by 1 and return.

class Solution {
    HashSet<Character> m = new HashSet<Character>();
    public int longestPalindrome(String s) {
        int longest = 0;
        for(int i=0;i<s.length();i++){
            if(m.contains(s.charAt(i))){
                m.remove(s.charAt(i));
                longest = longest + 2;
            }
            else{
                m.add(s.charAt(i));
            }
        }
        if(m.isEmpty()){
            return longest;
        }
        else{
            return longest+1;
        }
    }
}