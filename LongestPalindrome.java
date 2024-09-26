/*
Time complexity: O(n) single for loop 
Space : O(1) set will have at the max 26 chars so it is constant space
*/
import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            if(set.contains(c)) set.remove(c);
            else set.add(c);
        }
        return set.size() <= 1? s.length(): s.length()-set.size()+1;
    }  
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbbcsbdds"));
    }
}