// Time Complexity :O(n) n-length of the string
// Space Complexity :O(1) // max 52 characters so constant space
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this :-
class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.isEmpty())
            return 0;
        HashSet<Character> p=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(p.contains(c))// If contains the remove it and increase the count by 2
            {
                p.remove(c);
                count+=2;
            }
            else
                p.add(c);
        }
        return p.isEmpty()?count:count+1; //If set is not empty then one single alphabet can be used from that as a mid element in the palindrome
        
    }
}