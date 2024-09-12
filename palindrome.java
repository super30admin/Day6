//Time complexity : O(N)
//Space complexity: O(1) //Hashset
//Ran the code in Leetcode and got accepted on submission
class Solution {
    public int longestPalindrome(String s) {
        //Initialize the count to 0
        int count=0;
        //Define a hashset to store the char
        HashSet<Character> set = new HashSet<>();
        //Iterate over the given string
        for(int i=0;i<s.length();i++)
        {
            //storing the char to a variable c
            char c = s.charAt(i);
            //Checking if the hashset contains that char 
            if(!set.contains(s.charAt(i)))
            {
                //If not insert it into the hashset
                set.add(s.charAt(i));
            }
            //If the hashset does contain the character
            else
            {
                //Increment the count by adding 2 to it
                count+=2;
                //And remove the character from the hash set
                set.remove(s.charAt(i));
            }
        }
        //After iterating through the whole string check if the hashset is empty 
        if(!set.isEmpty())
        //If not increment the count by 1 as one of the characters in the palindrome
            count+=1;
        //Return the length of the largest palindrome that can be formed with the given characters
        return count;
    }
}