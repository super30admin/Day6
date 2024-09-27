class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length()==0)
        {
            return 0;
        }
        
        int count = 0;
        
        Map<Character, Integer> palin =  new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char si = s.charAt(i);
            if(!palin.containsKey(si))
            {
                palin.put(si , 1);
            }
            else{
                palin.put(si, palin.get(si)+1);
                if(palin.get(si)==2)
                {
                    palin.remove(si);
                    count = count+2;
                }
            }
        }
        
        if(count<s.length())
        {
            count = count+1;
        }
        return count;
    }
}
//runtime: O(nm)--O(n) for looping through the charecters of the string and O(m) is for the .contains method
//space complexity : O(m) for storing all the unique char with their frequency
