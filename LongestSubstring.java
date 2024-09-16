//Time Complexity :O(n)

class LongestSubstring {
    public int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap();

        for (int i=0; i< s.length(); ++i)
        {
            char c = s.charAt(i);
            map.put(c , map.getOrDefault(c,0)+1);
        }

        int maxPalindromeLen =0;
        boolean hasOddChar = false;

        for(int count : map.values())
        {
            if(count%2==0)
            {
                maxPalindromeLen += count;
            }
            else{
                hasOddChar = true;
                maxPalindromeLen += count -1;
            }
        }
        if(hasOddChar)
        {
            maxPalindromeLen += 1;
        }
        return maxPalindromeLen;

    }
}