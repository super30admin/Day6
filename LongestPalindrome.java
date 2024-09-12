// Time Complexity : O(n), n is length of string
// Space Complexity : O(1), set has constant space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        if(s.length() == 0 || s == null){
            return 0;
        }
        
        
        /*
        checking the occurences of each char whether is even or odd
        */
        
       
       HashSet<Character> set = new HashSet<>();
        
        int maxLengthPalin = 0;  
        for(char c : s.toCharArray()){
            
            //if set has character, then remove it from set and add 2 to length
            
            if(set.contains(c)){
                set.remove(c);
                maxLengthPalin += 2; 
            }else{
                set.add(c);
            }
        }
        
        //finally if the set has some elements left, it means that they are some chars which appear odd number of times
        //therefore add 1 to length
        if(set.size() > 0){
            maxLengthPalin += 1;
        }
        
        return maxLengthPalin;
    }
}
