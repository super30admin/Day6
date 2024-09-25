// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
import java.util.HashSet;

class Solution3 {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        int length = 0;
        HashSet<Character> map = new HashSet<Character>();
        for (int i=0;i<s.length();i++){
            if (!map.contains(s.charAt(i))){
                map.add(s.charAt(i));
            }
            else{
                map.remove(s.charAt(i));
                length=length+2;
            }
        }
        if (!map.isEmpty()){
            length=length+1;
        }
        return length;
    }
}