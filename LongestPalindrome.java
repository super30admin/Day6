//409. Longest Palindrome - Passed all test cases
/*
TC:O(n)
SC:O(1)
Method: Palindrome can be formed with even letters and can have 1 odd character, if present. Use a hashset. Add the character in set if it doesnt exist, else remove it from set and 
add count by 2. 
*/


class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(hs.contains(c))
            {
                len = len + 2;
                hs.remove(c);
            }
            else
            {
                hs.add(c);
            }
            
        }
        if(!hs.isEmpty()) return len+1;
        return len;
    }
}