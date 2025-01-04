import java.util.HashSet;
import java.util.Set;

// Time Complexity: O(n) as iteration for each character is carried out
// Space Complexity: O(n) as HashMap is used to store the occurences.

// Used Mapped Running Sum to check for its previous occurences. 
// and subtract the current - firstIndex should give the max.
//Max needs to be updated everytime if condition is met
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd")); // 7
        System.out.println(longestPalindrome("a")); // 1
    }

    public static int longestPalindrome(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray())
            if (set.contains(c)) {
                set.remove(c);
                count += 2;
            } else {
                set.add(c);
            }
        return set.isEmpty() ? count : count + 1;
    }
}
