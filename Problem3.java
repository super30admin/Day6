// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        //Create a HashSet to add the characters of the input string
        //Add the character if it doesn't exist in the set
        //If it exist increase the count by 2 and remove that character
        //In the end check if set is empty
        //Empty set means all the characters were in even count
        /**
         * If set is not empty then add one to count since we can have one odd count
         * character in the middle of a valid pallindrome
         */

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(!set.add(s.charAt(i)))
            {
                count+=2;
                set.remove(s.charAt(i));
            }

        }

        int misc = set.isEmpty() ? 0 : 1;

        return count+misc;
    }
}