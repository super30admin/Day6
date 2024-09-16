//Time complexity:O(n)
// Space complexity:O(n)
// Error while executing in leetcode:NO



class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character>aSet=new HashSet<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(aSet.contains(c))
            {
                aSet.remove(c);
            }
            else
            {
            aSet.add(c);
            }
        }
        if(aSet.size()!=0)
        {
             
            return s.length()-aSet.size()+1;
        }
        return s.length()-aSet.size();
    }
}
