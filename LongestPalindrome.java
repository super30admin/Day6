// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
//In this approach we are going to store every character in an hashset.
//Every time before we add a character to the set , we are going to check if it already exists or not.
//If it exists , we remove it from the set and increment the counter by 2, if not we just add it to set.
//In the end , if we see that there is any element in the set that didn't have a pair , we can have any one element in the palindrome and add 1 to the count
//else we can just return the count that we got from the pairs.
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(i));
                count = count + 2;
            }
            else
            {
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty())
        {
            count++;
        }
        
        
        return count;
        
    }
}