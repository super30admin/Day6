// Time Complexity : O(N)
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 
 

// Your code here along with comments explaining your approach
/*
In Hash set, we insert characters while traversing the Input String
-- If character is already in set, themn we will increment counter by 2 and will remove that character from set.

At end, if set is Non-empty, we will increment counter by 1 only 

*/


class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return -1;
        }
        
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            
            if(set.contains(ch)){
                set.remove(ch);
                count += 2;
            }else{
                set.add(ch);
            }
        }
        
        
        if(! set.isEmpty()){
            count = count + 1;
        }
        
        return count;


    }
}



// public class Problem3_LongestSubSeq {
//     public static void main(String[] args){

//     }
// }
