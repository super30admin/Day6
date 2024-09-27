// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            //if set contains the char, that means this is the second occurence & we can add 2 to the ount for the palindrome
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count = count+2;
            } else {
                set.add(s.charAt(i));
            }
        }
        
        //the leftover characters, we can have one added to the palindrome
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}