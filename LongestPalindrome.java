// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.HashSet;

public class LongestPalindrome {
	 public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count+=2;
            }else{
                set.add(c);
            }
        }
        
        return set.size()==0? count:count+1;
    }
}
