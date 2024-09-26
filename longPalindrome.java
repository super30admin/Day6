// Time Complexity : 0(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No for hashset


// Your code here along with comments explaining your approach





class Solution {
    public int longestPalindrome(String s){
        if(s == null || s.length() == 0) return 0; //check whether is string is null

        HashSet <Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++; // checking if element already exists in hashset , if it does then increment the count
            }
            else{
                hs.add(s.charAt(i)); //if it does not then add it to hashset
            }
        }

        if(!hs.isEmpty()) return count*2 + 1; // if hashset is empty increment the count to make the string palindrome
        return count*2; // return the string containing even number of elements
    }
}

