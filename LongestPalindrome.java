// Time Complexity : O(n) because we create an hashset
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> chars = new HashSet<>();
        int count = 0;
        for(char c : s.toCharArray()){
            if(chars.contains(c)){
                count += 2;
                chars.remove(c);
            }
            else{
                chars.add(c);
            }
        }
        if(chars.size() > 0)
            count++;
        return count;
    }
}