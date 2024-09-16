// Time Complexity : O(N) goes through array linearly
// Space Complexity :O(N) for Hashset created. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        if(null ==s || s.length()==0) return 0;
        HashSet<Character> hset= new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);     
            if(hset.contains(c)){  // checks if character already present meaning letter occured twice and palindrome can happen
                count+=2;    // increment count by 2 and remove both elements
                hset.remove(c);
            }
            
            else{
                hset.add(c);  // add to set if not present
            }
            
        }
        
        if(!hset.isEmpty()) return count+1; // if set is not empty then palindrome can be made with these letters so increment count by 1
        
        return count; // else return count
    }
}