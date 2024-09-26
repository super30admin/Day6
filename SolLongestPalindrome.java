// Time Complexity : O(n)
// Space Complexity : 1
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            } else{
                count+= 2;
                set.remove(ch);
            }
        }
        if(!set.isEmpty()){
            count ++;
        }
        return count;
    }
}