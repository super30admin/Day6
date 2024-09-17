import java.util.HashSet;

// Time Complexity : O(N) where N is the number of array elements
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
Use HashSet. if repeating characters, count+=2, finally if there are single chars left then add 1 since we can use it at
the middle of palindrome
* */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length()==0) return 0;

        HashSet<Character> hs= new HashSet<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(hs.contains(ch)){
                count+=2;
                hs.remove(ch);
            }else{
                hs.add(ch);
            }
        }
        return hs.size()==0 ? count : count+1;
    }
}
