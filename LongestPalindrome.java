class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        
        HashSet<Character> set=new HashSet<Character>();
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!set.contains(c))
                set.add(c);
            else
            {
                set.remove(c);
                len+=2;
            }
        }
        
        if(set.size()>0)
            len++;
        
        return len;

        // Time Complexity : O(n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : yes
        // Any problem you faced while coding this : no



        
        /*
        
        //With HashMap 
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!map.containsKey(c))
                map.put(c,0);
            map.put(c,map.get(c)+1);
        }
        
        if(map.size()==1) return map.
        
        int len=0;
        boolean flag=true;
        for(char c : map.keySet())
        {
            int count=map.get(c);
            if(count%2==0)
                len+=count;
            else{
                if(flag)
                {
                    flag=false;
                    count+=1;
                }
                
                len+=count-1;
            }
                
        }
        
        return len;*/
        
    }
}