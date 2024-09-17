// Time Complexity : O(n)
// Space Complexity : O(1) // because it will only have characters as mentioned in question.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return -1;
        Set<Character> set = new HashSet<>(); 
        int count = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(!set.contains(c))
            {
                set.add(c);
            }
            else
            {
                count += 2;
                set.remove(c);
            }
        }
        
        if(!set.isEmpty())
            count++; // just add one to create odd length palindrome
        
        return count;
    }
}
