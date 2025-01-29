import java.util.HashSet;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

public class Problem3 {

    public static void main(String[] args) {

//        String s = "abccccdd";
        String s = "a";

        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {

        HashSet<Character> set = new HashSet<>();
        int result = 0;

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(set.contains(c)) {
                result += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if(!set.isEmpty()) {
            result++;
        }

        return result;
    }
}
