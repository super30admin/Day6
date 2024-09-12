// Time Complexity : O(N) - N is size of the String
// Space Complexity : O(vocab) - Number of letters present in the String (MAX 26)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            else{
                set.remove(s.charAt(i));
                count = count + 2;
            }
        }
        if(set.size() > 0){
            count = count + 1;
        }
        return count;
    }
    
}
// Your code here along with comments explaining your approach
