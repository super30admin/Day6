//  T.C = 0(n)
//space = O(1)
class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> h = new HashSet<>();
        
        for(int i=0;i<s.length();i++)
        {
            
            if(h.contains(s.charAt(i)))
            {
                count = count + 2 ;
                h.remove(s.charAt(i));
            }
            else
            h.add(s.charAt(i));
        }
        if(!h.isEmpty())
        {
            count = count +1;
        }
        
        return count;
        
    }
}