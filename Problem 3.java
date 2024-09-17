//Time Complexity: O(N)
//Space Complexity: O(1)

import java.util.*;

class LongestPal {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(set.contains(c))
            {
                set.remove(c);
                count += 2;
            }
            else
                set.add(c);
        }
        
        if(!set.isEmpty())
            count++;
        return count;
    }
}
