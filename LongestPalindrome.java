package Day7;

import java.util.HashSet;

public class LongestPalindrome {

    public int longestPalindrome(String s) {

        //Edge case
        if(s == null || s.length()==0) return 0;

        HashSet<Character> set = new HashSet<>();

        int count = 0;

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }

        if(!set.isEmpty()){
            count++;
        }

        return count;

    }

    public static void main(String args[]){
        LongestPalindrome ob = new LongestPalindrome();

        System.out.println("Length of longest palindrome that can be formed by given string " + ob.longestPalindrome("abccccdd"));
    }
}
