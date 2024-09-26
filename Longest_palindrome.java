// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int longestPalindrome(String s) {
        
        //Declare a hashset and initialize counter to 0
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        // loop through the string 
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            //if element already present in the set,
            // increment counter by 2 and remove it from the set
            // else add element to the set 
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        
        //if the set is empty the return counter
        //else increment counter by one and return (odd length palindrome)
        return (set.isEmpty()) ? count : (count + 1);
    }
}