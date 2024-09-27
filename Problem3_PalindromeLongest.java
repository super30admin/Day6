import java.util.HashSet;
import java.util.Set;

// Time Complexity : o(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Problem3_PalindromeLongest {
    public int longestPalindrome(String s) {
        
       if(s==null ||s.length()==0)
           return 0;
        
        Set<Character> set=new HashSet<Character>();
        
        int count=0;
        
        for(char c:s.toCharArray())
        {
            if(!set.contains(c))
                set.add(c);
            else
            {
                count+=2;
                set.remove(c);
            }
            
        }
        return set.isEmpty()?count:count+1;
}
    
}
