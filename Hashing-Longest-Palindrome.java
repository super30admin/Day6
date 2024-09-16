// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to look up for Hashset functions



class Solution {
    public int longestPalindrome(String s){
        
        int count = 0;
        
        HashSet<Character> hs = new HashSet<>(); //New Hashset
        
        for (int i=0;i<s.length();i++){
            
            char ch = s.charAt(i); //Traversing each character of string
            
            if(hs.contains(ch)){ // If already present in hashset, then remove from hashset and increment count
                hs.remove(ch);
                count += 2;
            }
            else{
                hs.add(ch);  //Else add for the first time
            }
        }
        if(!hs.isEmpty()) return count + 1; //For 1 occurencec characters, adding one to the count
        else
            return count;  //If no 1 occurence, then return count;
    }
}
