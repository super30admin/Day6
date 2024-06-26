// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
 //use hash set add a character 'c' if there is no character 'c' in the set before, else remove 'c' and increase count value by 2
 //this will get all the pair characters
 //if hasset is not empty then elements of frequency 1 exist. therefore, we add +1 and return the count.

 import java.util.HashSet;

 class LongestPalindrome {
     public int longestPalindrome(String s) {
        
         HashSet<Character> set = new HashSet<>();
         int result =0;
         int len = s.length();
         for(int i=0;i< len;i++){
             char c = s.charAt(i);
             if(!set.contains(c)){
                 set.add(c);
             }else{
                 result += 2;
                 set.remove(c);
             }
         }
 
         return set.isEmpty()?result:result+1;
 
 
     }
 }
