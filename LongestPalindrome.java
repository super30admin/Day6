// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 409



class Solution {
    public int longestPalindrome(String s) {
        int count = 0 ;
        
        //create a set of character
        Set<Character> set = new HashSet<>();
        
        for(int i =0 ; i< s.length(); i++){
            //Add element if the ith character is not present in the set
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            //If the char is present, remove it and add 2 to the final count(1 ith element and 1 for the already existing element)
            else{
                set.remove(s.charAt(i));
                count+=2;
                }
        }
        //IF the set is empty, return the count
        if(set.isEmpty()) return count;
        //else,  there are many unique elements in the set and we can only use 1 for palindrome(in the middle)
        else return count+1;
    }
}