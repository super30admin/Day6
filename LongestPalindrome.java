import java.util.HashSet;
import java.util.Set;


// Time complexity: O(n)
// Space complexity: O(1)
public class LongestPalindrome {

    // LeetCode #409
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();

        // Put the character in the HashSet as long as we don't have a matching char in the string
        // Once we find the match remove it
        // So, the set will only include those elements which have a odd number of occurrences
        for(int i=0; i< s.length();i ++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                set.remove(c);
            }else {
                set.add(c);
            }
        }

        // Adding 1 if we have unmatched characters in the map.
        // These unmatched characters will create a odd length palindrome
        return set.size() == 0 ? s.length() : s.length() - set.size() + 1;
    }

    public static void main(String[] args) {
        LongestPalindrome pal = new LongestPalindrome();
        System.out.println("Longest palindrome is of length  = " + pal.longestPalindrome("abccccdd"));

    }
}
