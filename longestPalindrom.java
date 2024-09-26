// Time Complexity :O(l) where l is length of string 
// Space Complexity :O(l) where l is length of string 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        char[] scar= s.toCharArray();
        HashSet<Character> myset= new HashSet<>();
        
        for(int i=0;i<scar.length;i++){
            if(myset.contains(scar[i])){
                myset.remove(scar[i]);
                count += 2;
            }else{
                myset.add(scar[i]);
            }
        }
        if(!myset.isEmpty()){
            count++;
        }
       return count; 
    }
}