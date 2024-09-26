//TC:O(n)
//SC:O(n)
//successfully ran on leetcode

class Solution
{
    public int longestPalindrome(String s)
    {
        //set to keep track if we have encountered a character before
        HashSet<Character> set= new HashSet<>();

        int size=0;

        for(char c:s.toCharArray())
        {
            //if the set contains the character it measn it was encountered before so remove it from set and increment size by 2
            if(set.contains(c))
            {
                set.remove(c);
                size=size+2;
            }
            //otheriwse add the character to the set
            else
            {
                set.add(c);
            }
        }
        //if set is not empty increment size by 1
        if(!set.isEmpty())
        {
            size++;
        }
        return size;
    }
}
