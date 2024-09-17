// Time Complexity : O(n), where n is the size of the input string
// Space Complexity :O(1), though we are using hashSet to check duplicates, hashSet will maximum have 52 (constant) characters (lowercase + uppercase)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        //if input string is null OR Empty return 0
        if(s == null || s.length() == 0) return 0;
        
        //hashSet to check for duplicate characters
        HashSet<Character> hSet = new HashSet<>();
        int count = 0;
        
        for(int i=0; i <s.length() ; i++){
            //get the character of input String at index i
            Character sChar = s.charAt(i);
            //check if hashSet already contains the character
            if(hSet.contains(sChar)){
                //if yes, remove that character from the hashSet
                hSet.remove(sChar);
                //And increase the count by 2 (One for already existing occurence of                   the character and one for the current occurence)
                count +=2;
            }
            else{
                //if hashSet doesn't contain the character, simply add the character                   to the hashSet
                hSet.add(sChar);
            }
        }
        //In the end, check if the hashSet is Empty or not
        //If not, that means there are some characters left with count as 1
        //As you can use anyone of the remaining characters to form a palindrome, add           1 to the count
        if(!hSet.isEmpty()){
            count++;
        }
        //return the count
        return count;
    }
}