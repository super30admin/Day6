import java.util.HashSet;

// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(set.contains(ch)){
                count+=2;
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            count+=1;
        }
        return count;
    }
}
