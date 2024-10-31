// Time Complexity :longestPalindrome: O(n) , n is  number of characters in the string
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing

import java.util.HashSet;

public class Problem3 {
    public int longestPalindrome(String s) {
        HashSet<Character> oddSet = new HashSet<>();
        int count=0;
        for(char c: s.toCharArray()){
            if(oddSet.contains(c)){
                oddSet.remove(c);
                count += 2;
            }else {
                oddSet.add(c);
            }
        }

        if(!oddSet.isEmpty()){
            return count +=1;
        }
        return count;
    }

    public static void main(String args[]) {
         Problem3 problem3 = new Problem3();
        String s= "abacba";
        System.out.println("longest palindrome count is "+problem3.longestPalindrome(s));

    }
}
