class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> h = new HashSet<>();
        int size=0;
        for(int i=0;i<s.length();i++)
        {
            
            char c = s.charAt(i);
            
            if(h.contains(c))
            {
                size+=2;
                h.remove(c);
            }
            else
            {
                h.add(c);
            }
            
            
        }
        if(h.isEmpty())
                return size;
        else
            return size +1;
        
    }
}