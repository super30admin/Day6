// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Approach:
// 1. I used HashSet to store the characters in the given string. 
// 2. Every time we see a character which is already there in the hashset, we remove it from the hashset, as it forms a pair of characters, which can help make
// a palindrom and we increase the length of plaindrome with +2.
// 3. At last, if I see that after all the pairs have been formed, HashSet is not empty, then we add +1 to the length of our palindrome, as we can place any one
// character in the middle of our palindromic string.

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(Character c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count += 2;
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        return count;
    }
}
