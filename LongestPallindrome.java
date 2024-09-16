// Time Complexity : O(n) n = no.of char in string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()<1){
            return 0;
        }
        int count =0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char a  = s.charAt(i);
            if(set.contains(a)){
                count = count+2;
                set.remove(a);
            }else{
                set.add(a);
            }
        }
        if(set.size()>0){
            count++;
        }
        return count;
    }
}