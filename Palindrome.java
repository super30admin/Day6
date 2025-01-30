// Overall Time Complexity : O(n) . The n is number of characters in  the string.
// Overall Space Complexity : O(1) . The space complexity of storing alphabets is 0(1).
// Any problem you faced while coding this : No issues faced during implementation


// The solution to the problem involves creating a HashSet and checking if the occurence of a character is more than once.

import java.util.*;
public class Palindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> hset = new HashSet<>();
        int res = 0;

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!hset.contains(ch)){
                hset.add(ch);
            }
            else{
                res +=2;
                hset.remove(ch);
            }

        }
        if(!hset.isEmpty()){
            res+=1;
        }
        return res;
    }
}
