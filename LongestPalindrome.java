// Time Complexity :0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int count=0;

        for(int i=0;i<s.length();i++){   
            char c = s.charAt(i);
            if(set.contains(c)){
                count +=2;
                set.remove(c);
               }
            else
                set.add(c);
        }

        if(!set.isEmpty()) count++;
        return count;
    }
}