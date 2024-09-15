// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution{
    public int longestPalindrome(String s){
        // return 0 is the string is empty or null
        if(s == null || s.length() == 0) return 0;
        // intiatialize count variable
        // declare new character hashset
        int count = 0;
        HashSet<Character> set = new HashSet<>();

        // for each character in the string, insert the character
        // if it does not exist in hashset
        // if the hashset already contains the character,
        // remove the character from the hashset and increment count by 2
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        // if the hashset contains any elements, increment count
        if(!set.isEmpty()) count ++;
        return count;
    }
}