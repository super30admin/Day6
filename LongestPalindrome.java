// Time Complexity : O(n) where n is array size
// Space Complexity :O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1); // record all character frequencies
        }
        int len = 0;
        boolean odd = false;
        for(int i=0;i<s.length();i++)
        {
           if(map.containsKey(s.charAt(i)))
           {
               if(map.get(s.charAt(i))%2==0){ 
                   len+=map.get(s.charAt(i)); map.remove(s.charAt(i)); 	//if count is even, add it to length and remove from map
               }
               else
               {
                   len+=map.get(s.charAt(i))-1; map.put(s.charAt(i),1); odd=true; //if odd, add count-1 and put (char,1) in map
               }
           }
        }
        if(odd==true)len++;
        return len;
    }
}