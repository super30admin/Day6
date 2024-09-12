package Hashing2;

import java.util.HashSet;

public class question19_longestPalindrome {

    /*
    Using 1 HashSet ---->
        Time Complexity : O(n)
        Space Complexity: O(1)
     */

    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++) {
            if(set.contains(s.charAt(i))) {
                count += 2;
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()) count++;

        return count;
    }

    public static void main(String[] args) {

    }
}
