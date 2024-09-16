package S30_Codes.Hashing_2;

// Time Complexity = O(n) // n = s.length()
// Space Complexity = O(1)
// Hashing-2

import java.util.HashMap;
import java.util.Map;

class LongestPalindrome {
    public int longestPalindrome(String s) {

        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int length = 0;
        for(int frequency : map.values()){
            if(frequency%2 == 0)
                length += frequency;
            else
                length += frequency-1;
        }

        if(length < s.length())
            length++;
        return length;
    }
}