// Time Complexity : O(1) fixed number of charcaters 26
// Space Complexity : O(N) used hashset
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Could partially solve before class


// Your code here along with comments explaining your approach: Same as class

class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> ch = new HashSet<>();
        int count = 0;
        
        for(int i = 0; i< s.length(); i++){
            System.out.println(s.charAt(i));
            char l = s.charAt(i);
            if(ch.contains(l)){
                ch.remove(l);
                count += 2;
            }else{
                ch.add(l);
            }
        }
        
        if(!ch.isEmpty())
            count++;
        
        return count;
    }
}
