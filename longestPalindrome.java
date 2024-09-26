//Time complexity: O(n*sizeOfMap + n) ~ O(n*n)
//Space complexity: O(n+n) => O(n)

import java.util.*;
class LongestPalindromeLength {
    public int longestPalindrome(String s) {
        char[] cArr=s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<cArr.length; i++)
        {
            if(!map.containsKey(cArr[i]))
                map.put(cArr[i], 1);
            else
                map.put(cArr[i], map.get(cArr[i])+1);
        }
        int countEven=0, countOdd=0;
        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            int i = entry.getValue();
            if(i%2==0)
                countEven+=i;
            else
                countOdd+=i-1;
        }
        
        return countEven==cArr.length ? countEven :countOdd+countEven+1;
    }
}