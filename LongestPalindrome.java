//TC: O(n)
//SC: O(1)
//approach: using array to store character frequencies of each char in string
// for each char, if it has even count, add it to palindrome length,
// if there's at least odd count char, add one to overall length


public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int[] charCounts = new int[128];
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }
        int length = 0;
        boolean oddFound = false;

        for (int count : charCounts) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }
        if (oddFound) {
            length++;
        }

        return length;
    }
}
