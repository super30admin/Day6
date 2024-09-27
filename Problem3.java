// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : easy to think using hashmap, took time thinking for a solution for hashset


class Solution {

   public int longestPalindrome(String s) {

      HashSet <Character> set = new HashSet<>();
       int count = 0;
       for(int i = 0; i < s.length(); i++){

           char c =  s.charAt(i);
           if(set.contains(c)){
               set.remove(c);
               count += 2;
           } else {
               set.add(c);
           }

       }

       if(!set.isEmpty()){

           count++;

       }
       return count;

   }

}
