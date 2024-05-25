//Time Complexity - O(n)
//Space Complexity - O(1)  - 26 characters at most
//Leetcode - Yes
import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0; i < s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count = count + 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }

        }
        if(!set.isEmpty()){
            count = count + 1;
        }
    return count;
    }
}
