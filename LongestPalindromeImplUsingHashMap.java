import java.util.HashMap;
import java.util.Map;

/**
 * Time complexity is O(n)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 * https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindromeImplUsingHashMap {
    public static void main(String[] args) {
        String s = "abccccdd";
        int len = longestPalindrome(s);
        System.out.println(len);
    }

    private static int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        boolean hasOdd = false;
        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue() % 2 == 0){
                max = max + (int)entry.getValue();
            }
            else{
                max = (int)entry.getValue() - 1;
                hasOdd = true;
            }
        }
        if(hasOdd){
            max = max + 1;
        }
        return max;
    }
}
