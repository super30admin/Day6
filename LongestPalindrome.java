// Time Complexity- O(n)
// Space Complexity- O(1)
//Successfully ran on leetcode

import java.util.HashSet;

class Solution {
 public int longestPalindrome(String s) {
     
     if(s.length()==0) return 0;
     
     
     HashSet<Character> set = new HashSet<>();
     
    int count =0;
     
     for(int i=0; i<s.length(); i++){
         char c= s.charAt(i);
         
         
         if(!set.contains(c)){
             set.add(c);
         }
         else{
             set.remove(c);
             count=count+2;
         }
     }
     if(!set.isEmpty()){
         count++;
     }
     
     return count;
 }
}