// in this solution we will be adding the element in the set if it not present and if it is present we will be removing the element and incrementing our count by 2. In this way we can use the property of the palindrome that all the chracters except one character will be even in number. Finally we will be left with single characters in the set or no characters. accordingly we will update the count in the last.

// Time complexity: O(n)
// Space complexity: O(n) since we are using a set

import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int length = 0;
        if(s.length()==0 || s==null) return -1;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length();i++){
            char in = s.charAt(i);
            if(set.contains(in)){
                set.remove(in);
                length+=2;
            }
            else{set.add(in);}
            
        }
        if(set.size()>0) return length+1;
        else return length;
        

        
    }

    
}
