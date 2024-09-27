// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        if(s == null)
        {return 0;}
        HashSet <Character> hashSet = new HashSet<>();
        int size = 0;
        for(int x=0;x<s.length();x++)
        {
            char ch = s.charAt(x);
            if(hashSet.contains(ch))
            {
                size += 2;
                hashSet.remove(ch);
            }
            else
            {
                hashSet.add(ch);
            }
        }
        if(hashSet.isEmpty())
        {
            return size;
        }
    return size + 1;
 }
    
}

//TC O(n)
//SC O(1)