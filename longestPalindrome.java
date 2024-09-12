// Time Complexity : O(n) where n is the length of the string
// Space Complexity : O(52) -> O(1) space - max elements in the set are lower case and upper case characters.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: Order doesn't matter. Hence add the elements to a hashset. Once a duplicate is found we remove the element and increment the max length by 2. At the end if the set is not empty, we increment the length by 1.

class Solution {
    public int longestPalindrome(String s) {
       if(s==null || s.length()==0) return 0;
        Set<Character> hset=new HashSet<Character>();
        int len=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!hset.contains(c)){ //O(1)
                hset.add(c);
            }
            else{
                hset.remove(c);
                len+=2;
            }
        }
        if(hset.size()>=1)
            return len+1;
        else return len;
    }
}