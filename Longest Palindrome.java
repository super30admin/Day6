#time Complexity=O(n)
#Space Complexity=O(1)
class Solution {
    public int longestPalindrome(String s) {
if(s.length()==0||s==null)
{
    return 0;
}
        HashSet<Character> set=new HashSet<>();   
         int len=0;
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
                if(set.contains(a))
                {   
                    len=len+2;
                    set.remove(a);
                    
                }
            else
            {
                set.add(a);
            }
        }
            
            if(set.size()>0)
            {
                len++;
            }
        return len;
        
        }
}