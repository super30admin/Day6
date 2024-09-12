// Time Complexity :O(N) - linear scan of array 
// Space Complexity :O(N) - uing an auxiliary structure  - set interface 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : yes, i spent a lot of time to evaluate the size to return as I wasnt considering one additional element that can be present in the middle of the palindrome


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        
        Set<Character> set = new HashSet<Character>();
        char[] charArray = s.toCharArray();
        for (char ch: charArray){
            if (set.contains(ch)){
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        // found pairs for every chacter , so length of the initial string is the length of palindrome
        if (set.size () == 0){
            return s.length();
        }
        return s.length() - set.size() + 1;
        // s.length() - set.size() => number of elemnts whose pairs have been found 
        // +1 because we can have one elemnt in the middle "pap" - for eg "a" can  still be used and included in the palindrome  
    }
}