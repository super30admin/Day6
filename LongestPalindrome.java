// The idea is quite simple, a palindrome can be of even length or of odd length. So in the given string, you combine all the character which are repeated 
// twice, and calculate it's length. 
// If the length calculated is equal to the length of the given string, then you have included all the characters of the given string and just return the length. 
// If not, then your palindrome will be of odd length, and you can include one more character into your palindrome, so return length + 1

// Time Complexity : O(n) where n is the length of the given string
// Space Complexity : O(1)

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int[] count = new int[52];
        int len = 0;

        for (char c : s.toCharArray()) {
            if (++count[c - 'a'] == 2) {
                len += 2;
                count[c - 'a'] = 0;
            }
        }
        return len == s.length() ? len : len + 1;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
