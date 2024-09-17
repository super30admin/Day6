//Time complexity: O(N)
//Space complexity: O(N)

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer>map=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
            }
            else
            {
                int x=map.get(s.charAt(i));
                x++;
                map.put(s.charAt(i),x);
            }
        }
        int res=0; int f=0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
           int a= entry.getValue();
        if(a%2==0)
        {
            res+=a;
        }
        else
        {
            res+= (a/2)*2;
            
            if(f!=1)
            {
                res+=a%2;
                f=1;
            }
        }
       
    }
         return res;
    }
}