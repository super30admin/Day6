// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : -

class LongestPalindrome{
    public int longestPalindrome(String s) {
        int result = 0;
        if(s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
            } else {
                set.remove(c);
                result = result + 2;
            }
        }
        if(!set.isEmpty()){
            result = result +1;
        }
        return result;
    }
}