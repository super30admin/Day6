// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length() ==0){
            return 0;
        }
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(hs.contains(c)){
                count = count+2;
                hs.remove(c);
            }
            else {
                hs.add(c);
            }
        }
        if(!hs.isEmpty()){
            count = count +1;
        }
        return count;
    }
}