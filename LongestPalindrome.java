// TC : O(n)
// SC : O(1)


class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        int max=0;
        boolean flag = false;
        for(int i : hm.values())
        {
            if(i%2==0)
            {
                max+=i;
            }
           else
           {
               if(!flag)
               {
                   max+=i;
                   flag=true;
               }
              else
              {
               max+=i-1;
              }
           }
        }
        return max;
    }
}
