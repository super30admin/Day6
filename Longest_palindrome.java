Time Complexity: O(n) time to traverse the whole string.
Space Complexity: O(n) space to store the characters in the string.
class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length() == 0)
            return -1;
        HashSet<Character>set = new HashSet<>();
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char a = s.charAt(i);
            if(!set.contains(a))
            {
                set.add(a);
            }
            else
            {
                count = count +2;
                set.remove(a);   
            }
        }
        
        if(!set.isEmpty())
            return count +1;
        else
            return count;
    }
}