// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int longestPalindrome(String s) {

        HashSet<Character> set = new HashSet();

        int length = 0;

        //traverse over the string and pair off chars that will form palindrom

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            //if char is seen before, it adds to length of pali and gets removed from set
            if(set.contains(c))
            {
                length+=2;
                set.remove(c);
            }

            //if not seen before, add it to set so that it can be paired off with another same incoming char
            else
                set.add(c);
        }

        //if in the end set still has elements, they are single chars, one of them will be put in the middle of the palindrom string
        if(set.size()>0)
            length++;

        return length;
    }
}
