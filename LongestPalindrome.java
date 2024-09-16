// Time Complexity :O(n)+O(n)=> O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.HashMap;

class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int output = 0;
        int flag =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Character c:map.keySet())
        {
            if(map.get(c)>1)
            {
                int count= map.get(c)-map.get(c)%2;
                output+=count;
                map.put(c,map.get(c)-count);
            }
            if(map.get(c)==1 && flag ==0)
            {
                output+=1;
                flag=1;
            }
        }
        return output;
        
    }
    public static void main(String args[])
    {
        System.out.println(longestPalindrome("aabbc"));
    }
}