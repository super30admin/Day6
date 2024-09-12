//Time Complexity: O(n) . It is a single pass algorithm
// Space Complexity: O(1). Since atmost we will store 52 letters( 26 lower case+ 26 upper case)
// Source: Leetcode #409
class Solution {
    
    public int longestPalindrome(String s) {
		
		if(s.length()==1)
            return 1;
		
        int length=0;
        HashSet<Character> set=new HashSet<Character>();
        
        for(char ch: s.toCharArray())
        {
			//Check if the character is present, if it is then, we can form a longer palindrome by considering these 2 characters
            if(set.contains(ch))
            {
                length+=2;
                set.remove(ch);
            }
            else
            {
                set.add(ch);
            }
        }
        
        return length + (set.size()>0? 1: 0);
        
    }
}