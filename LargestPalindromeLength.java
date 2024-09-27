// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach


class Solution {
    public int longestPalindrome(String s) 
    {   //created a hashset
        HashSet<Character> set =new HashSet<>();
        int count=0;
        //iterating through the string
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            //if set contains c, increase count by 2 and remove c from set
            if(set.contains(c))
            {
                count+=2;
                set.remove(c);
            }
            //if not, add c to set
            else
            {
                set.add(c);
                
            }   
        }
        //if after iteration, set is not empty,increase count to one
        if(!set.isEmpty())
            {
                count++;
            }
        return count;
    }
}