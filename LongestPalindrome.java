/*
 * Time Complexity : O(N)
	Space Complexity : O(1) since the max number of chars in my set will be 26. Thus my tc is constant.
 	Did this code successfully run on Leetcode : Yes
 	Any problem you faced while coding this : No
 */

/*
Approach :
Iterate each char in the given string . 
If char is not presnt in hasset then insert in hash set 
if it is prenst increase the count = count+2 and and remove it from hashset 
at the end if hashset is not empty return count+1;
else return count;
*/
	
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s == null || s.length()<=0){
            return -1;
        }
        int count = 0;
        char[] a = s.toCharArray();
        for(char c : a){
            if(set.contains(c)){
                count = count+2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(set.isEmpty()){
            return count;
        }
        else{
          return  count+1;
        }
        
    }
}
