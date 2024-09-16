//Facebook Interview 
//Time complexity : O(n)
//Space complexity :O(1)
class Solution {
    public int longestPalindrome(String s) {
        //Checking the base case if string s is null or string length = 0 then return the zero.
        if(s == null || s.length() ==0) return 0;
        //Creating a HashSet for character
        HashSet<Character> set = new HashSet<>();
        //Initializing count to check the length of the longest palindrome as count variable
        int count = 0;
        //Checking from zero to its last index and incrementing based on count
        for(int i=0; i<s.length();i++){
            //string s checking the character index and assinging it to character c variable
            char c =s.charAt(i);
            //If contains in set c character count 2 need to remove else if it is not 2 then need to add hashset the count of character
            if(set.contains(c)){
                //count = count+2;
                count +=2;
                set.remove(c);
            } else{
                set.add(c);
            }
        }
        //if it not empty hashset the increment the count 
        if(!set.isEmpty()){
            count++;
        }
        //return the count the length of the longest palindrome
        return count;
        
    }
}