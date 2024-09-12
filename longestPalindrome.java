//Time Complexity : O(N)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        //if the length of the string is null 
        if(s==null||s.length()==0)
            return 0;
        //initialize a hashset with return type char
        HashSet<Character> hashSet=new HashSet<>();
        //to store the length of the palindrome
        int palinLen=0;
        //to iterate through each char in the given string
        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);
            //if the character is already in the hashset
            if(hashSet.contains(c)){
                //then we increment the len of palindrome by 2 and remove it from the hash set
                palinLen=palinLen+2;
                hashSet.remove(c);
            }
            else
                //just insert into the set
                hashSet.add(c);
        }
        //if the hashset is not empty then the len of palindrome can be odd
        if(!hashSet.isEmpty())
            palinLen++;
        //else we have a even palindrome and return its length
        return palinLen;
            
    }
}