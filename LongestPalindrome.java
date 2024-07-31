// Basic idea- if you get 2 characters, you know it can be a palindrome.
// so put them in a set. If you encounter a new character, push it in the set
// you get the same character, pop the one inside the set.
// lastly, say you get only 1 character, which is not a pair. it could be a part of palindrome 
// eg - abeba

// Space Complexity = O(1) (max 26 letters will be inside the set)
// Time complexity = O(n) (size of the char array<- directly proportional to string length).

import java.util.HashSet;
import java.util.Set;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        int ans=0;
        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for(char c: ch) {
            if(set.contains(c)) {
                set.remove(c);
                ans+=2;
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) {
            ans++;
        }
        return ans;
    }
}