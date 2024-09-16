// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :Nil


package leetcode;
import java.io.*;
import java.util.*;
class Faang19 {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                set.remove(s.charAt(i));
                count +=  2;
            }
        }
        if(!set.isEmpty()){
            count++;
        }
    return count;
    }

    public static void main(String[] args) {
        Faang19 object =new Faang19();
        String s = "aaabbccd";
        System.out.println(object.longestPalindrome(s));
    }
}