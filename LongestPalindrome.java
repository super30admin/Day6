//Time Complexity - O(n)
//Space Complexity - O(n)
import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        boolean oddCount = false;
        int longestPalindrome = 0;
        for(int i=0;i<s.length();i++) {
            charCount.put(s.charAt(i),charCount.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character, Integer> entry: charCount.entrySet()) {

            if(entry.getValue() %2==0) {
                longestPalindrome += entry.getValue();
            }

            else {
                oddCount = true;
                longestPalindrome += entry.getValue() - 1;
                charCount.put(entry.getKey(),1);
            }

        }
        return oddCount?longestPalindrome+1:longestPalindrome;

    }
}