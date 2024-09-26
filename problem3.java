import java.util.*;

public class problem3 {

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

public int longestPalindrome(String s) {
        
    HashSet<Character> hs = new HashSet<>();
    int ans=0;
    
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        
        if(!hs.contains(c)){
            hs.add(c);
        }else{
            ans = ans+2;
            hs.remove(c);
        }
    }
    
    if(!hs.isEmpty()){
            ans=ans+1;
        }
    return ans;
}
}
