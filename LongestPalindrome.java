import java.util.HashSet;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    //iterate through the string, check if the character exist in the set
    //if it does, then increase the length of longest palindrome by 2 
    //and then remove that character from the set
    // Else put the char into set
    //atlast, if set is not empty add one to the length(odd palindrome)
    public int longestPalindrome(String s) {
        //null check
        if(s==null || s.length()==0) return 0;
        HashSet<Character> set= new HashSet<>();
        int lengthans =0;
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                lengthans=lengthans+2;
                set.remove(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }
        }
        if(set.size()!=0){
            lengthans++;
        }
        return lengthans;
    }
}