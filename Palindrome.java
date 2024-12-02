import java.util.HashSet;

public class Palindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int longestSize = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                longestSize += 2;
            } else
                hs.add(s.charAt(i));
        }

        if (hs.size() > 0)
            longestSize += 1;

        return longestSize;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        Palindrome p = new Palindrome();
        System.out.println(p.longestPalindrome(s));
    }
}
