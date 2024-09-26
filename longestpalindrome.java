/*
Here we have to find longest palindrome. 
A string would be given and we need to rearrange it to find out the longest possible palindrome.
A palindrome is a string like this aabcbaa or aabbaa.
We need to give the length of longest possible palindrome.
Approach:
Take a hashset and start inserting new letters found.
If letter is already present increase the count by 2 and remove the letter from hashset // here it means that the letter is already present so twice the occurence.
If hashset is not empty it means that atleast one letter is still present which can be used to increase the length of palindrome and hence add 1 to the total count.
Return count in the end. 
*/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0; i<s.length();i++){
            char c =s.charAt(i);
            if(set.contains(c)){
                count = count+2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
           count++;
        }
        return count;
    }
}

