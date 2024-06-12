class Solution {
    public int longestPalindrome(String s) {
        
        if(s.length()==0 || s== null) return 0;
        
        HashSet<Character> hs = new HashSet<>();
        int count =0;
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(hs.contains(c))
            {
              count += 2;
              hs.remove(c);  
            }else
                hs.add(c);
                  
        }
        
        if(!hs.isEmpty())
            return count += 1;
        
        return count;
    }
}
