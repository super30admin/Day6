//Time Complexity- O(n)
//Space Complexity=O(n)
class Solution {
    public int longestPalindrome(String s) {
        if(s.length()<1||
          s==null)
        {
            return 0;
        }
        HashSet<Character>hashSet=new HashSet();
        int length=0;
        for(int i=0;i<s.length();i++)
        {
            if(hashSet.contains(s.charAt(i)))
            {
                length+=2;
                hashSet.remove(s.charAt(i));
            }
            else{
                hashSet.add(s.charAt(i));
            }
        }
        if(hashSet.size()>0)
        {
            return length+1;
        }
        return length;
         
    }
}