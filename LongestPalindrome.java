//Igonore first odd value and all even value aaaabbbccc a = 4, b =3 c =3
//Igonore b but not c so count -1
//
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int longestPalindrome(String s) {
           if(s.length() == 0)
            return 0;
        
        int count = s.length(); 
        
        HashMap <Character,Integer> map= new HashMap();
        
        for(char c: s.toCharArray())
        {
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        
        boolean odd = false;
        
     for(HashMap.Entry<Character,Integer> entry : map.entrySet())
     {
         if(entry.getValue()%2!=0) 
         {
             count --;
             odd = true;
         }
     }
        if(odd == true)
            return count+1;
    return count;
    }
}
