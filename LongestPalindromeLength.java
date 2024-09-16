// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

class LongestPalindromeLength {
    public int longestPalindrome(String s) {
        
        Set<Character> set = new HashSet<>();
        int count = 0;
        
        for(int i=0; i<s.length(); i++) {
            
            if(!set.contains(s.charAt(i))){                
                set.add(s.charAt(i));                
            }
            else{
                set.remove(s.charAt(i));
                count += 2;
            }
            
        }
        
        if(set.isEmpty())
            return count;
        else
            return count+1;
        
    }
}