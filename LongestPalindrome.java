import java.util.HashSet;
import java.util.Set;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//In palindrome every character is present twice except the middle element when length is odd.
//If we find a character not in hashset then we add it to hashset, if the character is already there then increase the count by 2 and remove that character.
//At the end if set has any element left then we just add 1 to count to make it odd length(longest).
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        //can also use boolean array of len 26 instead of set
        Set<Character> set=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                set.remove(ch);
                count=count+2;
            }else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}
