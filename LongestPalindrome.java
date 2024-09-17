// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {

        Map<Character , Integer> map = new HashMap<Character, Integer>();

        for (int i = 0 ; i < s.length(); i ++){
            char ch = s.charAt(i);
            if (map.get(ch) == null){
                map.put(ch , 1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }        }
        int len = 0;
        boolean isConsideredOdd = false;

        for (int freq : map.values()){
            if (freq %2 == 0){
                len += freq;
            }
            else {
                if (!isConsideredOdd) {
                    len += freq;
                    isConsideredOdd = true;
                }
                else{
                    len += freq -1;

                }
            }
        }
        return len;
    }

    public static  void main (String [] args){
        LongestPalindrome.longestPalindrome("");
    }

}

