// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No





class LongestPalindromeString 
{
    public int longestPalindrome(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int longest=0,great = 0;
        boolean condition = false;
        if(s.length()==1)
            return s.length();
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
            
            great = great>=map.get(c)? great:map.get(c);
            
            if(map.get(c)%2==0)
                longest +=2;
        }
        for(Integer value: map.values())
        {
            if(value%2!=0)
                condition = true;
        }
            
        if(map.containsValue(s.length()))
           return s.length();
        if(map.containsValue(1)||great%2!=0 || condition==true)
            longest += 1;
        
        return longest;
            
    }
}