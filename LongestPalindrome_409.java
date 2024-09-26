import java.util.HashSet;

// Time Complexity : O(n) n= number of character
// Space Complexity : O(n) n= number of character
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class LongestPalindrome_409 {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        char[] charArray= s.toCharArray();
        
        int size=0;
        //we remove if we character second time and add 2 into and if it is first time then add it
        for(char c:charArray){
            
            if(set.contains(c)){
                set.remove(c);
                size = size +2;
            } else {
                set.add(c);
            }
            
        }
        
        //if we have atleast one single character add it in size
        
        if(!set.isEmpty()){
            size++;
        }
        
        return size;
            
    }
}