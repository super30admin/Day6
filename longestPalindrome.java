import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        /*
        Time complexity: O(n)
        Space complexity: O(n)
        */
        
        // initialize hashset
        HashSet<Character> hset = new HashSet<Character>();
        
        int len = 0;
        // traverse the string
        for(int i = 0; i < s.length(); i++) {
            // get the char at i in s
            char c = s.charAt(i);
            
            // check if hset contains the character c
            if(hset.contains(c)) {
                // add 2 to the len
                len += 2;
                // remove the character c
                hset.remove(c);
            }
            // else if the hset does not contain c
            else {
                // add the character c to the hset
                hset.add(c);
            }
        }
        // if hset is not empty
        if(!hset.isEmpty()){
            // then add 1 to the len
            len += 1;
        }
        // return the len value
        return len;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abccccdd";
        System.out.println(solution.longestPalindrome(s));
    }
}