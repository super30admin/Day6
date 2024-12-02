import java.util.HashSet;

/**
 * Time complexity is O(n)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 * https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindromeImplUsingHashSet {
    public static void main(String[] args) {
        String s = "abccccdd";
        int len = longestPalindrome(s);
        System.out.println(len);
    }

    private static int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                set.remove(ch);
                count = count + 2;
            }
            else{
                set.add(ch);
            }
        }

        if(!set.isEmpty()){
            count = count + 1;
        }
        return count;
    }
}
