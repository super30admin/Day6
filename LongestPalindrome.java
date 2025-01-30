import java.util.HashSet;

public class LongestPalindrome {

        public int longestPalindrome(String s) {
            // Initialize a set to keep track of characters with odd frequencies
            HashSet<Character> charSet = new HashSet<>();
            // Initialize the length of the longest palindrome
            int length = 0;

            // Iterate over each character in the string
            for (char c : s.toCharArray()) {
                // If the character is already in the set, remove it and increase the length by 2
                if (charSet.contains(c)) {
                    charSet.remove(c);
                    length += 2;
                } else {
                    // If the character is not in the set, add it to the set
                    charSet.add(c);
                }
            }

            // If there are any characters left in the set, add 1 to the length for the middle character
            if (!charSet.isEmpty()) {
                length += 1;
            }

            // Return the total length of the longest palindrome
            return length;
        }

}
