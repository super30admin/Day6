import java.util.HashMap;
import java.util.Map;

// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
/*
Approach:
1) created a hashmap storing all frequencies of characters
2) running on length of string we can encounter 3 possiblities
    1) if the character is unique, in this case we keep the element to be considered at last and store the number of unique characters
    2) if there are even characters, we just check and add the count of all characters, as we can use all of them at once and update the count in map as 0
    3) if there are odd characters, we just update the count in map by -1, we remove that extra character and update count of unique character e.g
        ccc-> we can consider 2 c's and and maybe use last c in later part 
        thus in map -> {initial count of c:3} -> new count ->2 and uniquechar +1;
3) lastly, we just check if unique char count >0 if yes we add 1+ countof all even characters as we can just conider 1 single character in the end to make a plaindrome 
    eg ccccdde

*/

class longestPalindromes {
    public int longestPalindrome(String s) {
        
        if(s==null || s.length()==0)
            return 0;
        else
            if(s.length()==1)
                return 1;
        
        Map<Character,Integer> map = new HashMap<>();
        int count=0;
        
        
        for(char c: s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        
        
        int uniqueChar=0; // single unique character can be appended in the end
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            if(map.containsKey(c))
            {
                int keyVal = map.get(c);
                
                 if(map.get(c)==1) // unique character count
                {
                    uniqueChar++;
                    
                }
                
                else if(keyVal%2==0) // encountering even characters
                {
                    count+=keyVal;
                    
                    map.put(c,0);
                }
                
                else if(keyVal%2==1) // encountering odd characters
                {
                    map.put(c,map.get(c)-1);
                    uniqueChar++;
                }
                
            }
        }
        
        return (uniqueChar>0) ? count+1 : count;
        
    
    }
}