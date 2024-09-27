// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// make a hashset to contain the old character and if contians increase count by 2 and remove the old one.
// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(hs.contains(ch)){
                count += 2;
                hs.remove(ch);
            }else{
                hs.add(ch);
            }
        }
        if(!hs.isEmpty()){
            count++;
        }
        return count;
    }
}