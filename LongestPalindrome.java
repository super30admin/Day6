// Time Complexity : O(n))
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        //null check
        if(s == null ) return 0;
        
        char[] cArr = s.toCharArray(); //converting string to charArray
        
        HashSet<Character> hs = new HashSet<>(); //new HashSet to store chars
        int count = 0;// initializing counter
        
        for(char c : cArr) { //running loop over the charArray
            if( hs.contains(c) ) { //checking if current char is in HashSet
                hs.remove(c); //if it is present already
                count = count + 2; //increase the counter by 2 
            }
            else {
                hs.add(c); //if it is not present NOT increasing the counter, just adding
            }
        }
        
        if(!hs.isEmpty()) count++; 
        //if HashSet is not empty at the end it means no matter how many chars are left, I can only afford to have one non-pair element
        //so incrementing count by 1
        
        return count;
        
    }
}