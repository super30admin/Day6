// Time Complexity : O(n)
// Space Complexity : O(1) because it will not be more than 26
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count += 2;
                
            }
            else{
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()){
            count+=1;
        }
        return count;
    }
}