import java.util.*;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char current: s.toCharArray()){
            if(set.contains(current)){
                count += 2;
                set.remove(current);
            } else {
                set.add(current);
            }
        }

        return set.isEmpty()? count: count + 1;
    }
    public static void main(String[] str){
        int ans = new LongestPalindrome().longestPalindrome("adadartt");
        System.out.println(ans);
    }


}
