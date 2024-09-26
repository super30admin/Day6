class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> map=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(map.contains(a))
            {
                map.remove(a);
            }
            else
            {
                map.add(a);
            }
        }
        if(map.size()<=1)
        {
            return s.length();
        }
        else
        {
            return s.length()-map.size()+1;
        }
    }
}