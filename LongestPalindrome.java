// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Notes: Add 2 to the palindrome length iteratvely, if char is found even number of times. Add 1 if there are characters occuring only once. 

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if( s.length() == 0) return -1;
        
        int palindromeLength = 0;
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        char[] sArray = s.toCharArray();
        
        for ( char chr : sArray ){
            if(map.containsKey(chr)){
                int prevCount = map.get(chr);
                if(prevCount % 2 == 1){
                    palindromeLength = palindromeLength + 2;
                }
                
                map.put(chr, prevCount + 1);
            } else{
                map.put(chr , 1 );
            }
            
        }
        
        if(palindromeLength < s.length()){
            palindromeLength = palindromeLength + 1;
        }
        
        return palindromeLength;
    }
}
