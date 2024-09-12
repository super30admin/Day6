// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution1 {
    public int longestPalindrome(String s) {
        if (s==null || s.length() == 0){
            return 0;
        }
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
            } else {
                count += 2;
                set.remove(c);
            }
        }
        if(!set.isEmpty()){
            count += 1;
        }
        return count;
    }
}