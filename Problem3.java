//Longest Palindrome


// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for( int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                count = count + 2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }

        }
        if(!set.isEmpty())
            count++;
        return count;

    }
}