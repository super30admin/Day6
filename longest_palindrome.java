// Time Complexity : O(n) where n is length of string
// Space Complexity : O(n) for hashset
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> hashSet = new HashSet<>();
        int size=0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(hashSet.contains(ch)){// if char already exists , then add 2 to answer and remove the character
                size+=2;
                hashSet.remove(ch);
            }
            else{//else add the character
                hashSet.add(ch);
            }  
        }
        
        if(hashSet.isEmpty()){//If even palindrome, then hashset is empty as we are removing evenly occured characters, in that case we return the size
            return size;
        }
        
        return size+1;// If odd palindrome, hashset is not empty, but there can only be one extra letter in the middle
    }
}
