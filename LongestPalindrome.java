/**
 * time complexity is O(n)
 * space complexity is O(n)
 */
import java.util.HashSet;
import java.util.Set;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                set.remove(ch);
                result = result + 2;
            }
            else {
                set.add(ch);
            }
        }
        if(set.isEmpty()) {
            return result;
        }
        return result + 1;
    }
}