//Time complexity:O(n)
//Space complexity: O(1)
//Executed on leetcode: Yes


class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0 || s == null) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(set.contains(c))
            {
                count = count+2;
                set.remove(c);
            }
            else
            {
                set.add(c);
            }
            
        }
        if(!set.isEmpty())
        {
            count = count+1;
        }
        return count;
    }
}