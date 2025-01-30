//TC: O(n)
//SC: O(1)
//Did the code run on leetcode: Yes

import java.util.HashSet;

public class Solution_LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> hset = new HashSet<>();
        int result = 0;
        char c;
        for(int i=0; i < s.length(); i++){
            c = s.charAt(i);
            if(hset.contains(c)){
                result += 2;
                hset.remove(c);
            } else {
                hset.add(c);
            }
        }
        if(!hset.isEmpty()){
            result++;
        }
        return result;
    }
}
