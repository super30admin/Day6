import java.util.HashSet;
import java.util.Set;

/**
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * Ran on leetcode?: Yes
 * Any problems faced?: No
 */
public class LongestPalindromeLength {
    public int longestPalindrome(String s) {
        if (s == null || s.isEmpty())
            return 0;
        int count = 0;

        // Store characters as traversed
        Set<Character> set = new HashSet<>();

        for(char ch: s.toCharArray()) {
            if (set.contains(ch)) {
                // if a matching character is seen, increase count with 2 and remove the character from set
                count += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

        // if there are some items in set, it means they are odd numbered items.
        // It can only contribute once in the center in a palindrome
        if (!set.isEmpty()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "abcdddcdcbq";
        LongestPalindromeLength obj = new LongestPalindromeLength();
        int result = obj.longestPalindrome(string);
        assert (result == 9);
    }
}
