// Time Complexity :O(N) , N is length of string
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Check for the occurance of the character
//1 pass approach Since hashset contains unique values, whenever we encounter a duplicate entry we remove the char from the hash set and
//increment the count variable by 2

class Solution {

    public int longestPalindrome(String s) {
        if(s==null || s.length() == 0){
            return 0;
        }
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(set.contains(currentChar)){
                count = count + 2;
                set.remove(currentChar);
            }
            else{
                set.add(currentChar);
            }
        }
        if(set.size() > 0){
            count++;
        }
        return count;
    }
}