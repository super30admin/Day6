// Time Complexity :o(N)
// Space Complexity :o(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        
        int count=0;
        
        HashSet<Character> hashset = new HashSet();
        
        for(int i=0;i<s.length();i++){
            
            if(!hashset.contains(s.charAt(i))){
                hashset.add(s.charAt(i));
            }else{
                count+=2;
                hashset.remove(s.charAt(i));
            }
        }
        return hashset.isEmpty() ? count :count+1;
    }
}