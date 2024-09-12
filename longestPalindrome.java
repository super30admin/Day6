/**

TC - O(n) + O(26) = O(n) where n is the length of given string.
SC - O(1)

**/
class Solution {
    public int longestPalindrome(String s) {
        
        if (s.length() == 1)
        {
            return 1;
        }
        
        Map<Character, Integer> charToFreq = new HashMap<>();
        
        for (int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            
            charToFreq.put(c, charToFreq.getOrDefault(c, 0) + 1);
        }
        
        int maxPalindrome = 0;
        boolean isOddChar = false;
        
        for (int value : charToFreq.values())
        {
            if (value == 1)
            {
                isOddChar = true;
            }
            else if(value % 2 == 1)
            {
                maxPalindrome += value - 1;
                isOddChar = true;
            }
            else
            {
                maxPalindrome += value;
            } 
        }
        
        if (isOddChar)
        {
            maxPalindrome += 1;
        }
        
        return maxPalindrome;
    }
}