// Time Complexity: O(n)
// Space Complexity: O(1) - Since the set will have at most 26 characters

// Approach: I will use a hashset to store the characters. If the character is already present in the set, I will remove it and increment the result by 2.

import java.util.HashSet;
import java.util.Set;

public class Problem3 {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int res = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(set.contains(ch)){
                res += 2;
                set.remove(ch);
            }else{
                set.add(ch);
            }

        }

        if(!set.isEmpty()){
            return res + 1;
        }
        return res;
    }
}
