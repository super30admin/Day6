// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No  


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int result = 0;
        boolean flag = true;
        for(int i:map.values()){
            if(i%2!=0){
                flag = false;
            }
            result += i/2;
        }
        if(flag){
            return result*2;
        }else{
            return result*2+1;
        }
    }
}