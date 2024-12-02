import java.util.HashMap;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
import java.util.HashSet;

public class longestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int count = 0;
        HashSet<Character> sMap = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(sMap.contains(c)){
                count += 2;
                sMap.remove(c);
            }
            else{
                sMap.add(c);
            }
        }
        if(!sMap.isEmpty()){
            count++;
        }
        return count;
    }
}
