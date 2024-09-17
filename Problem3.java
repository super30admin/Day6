import java.util.*;
// Time Complexity : O(n) - n - length of string
// Space Complexity : O(n) - set may contain n unique characters
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class Problem3 {
    
    public static int longestPalindrome(String str){

        int len=0;
        HashSet<Character> set = new HashSet<>();
        for(char c: str.toCharArray()){
            if(set.contains(c)){
                len+=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        return set.isEmpty() ? len : len+1;

    }
    public static void main(String[] args){
        String str ="aba";
        System.out.println(longestPalindrome(str));
    }
}