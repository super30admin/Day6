// Time Complexity : O(n) for going through each element.
// Space Complexity : O(1) cause there are just 26 fiexed alphabets so max it can take 56 characters space.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
1. use hashset to store each element from the string.
2. if the element already exists, incease the count as we can use that pair in palandrome.
3. if not then just add the element in the hash set.
4. end of travesal of each elements, if there anre any remaining elements in the
hashset add one to the count and return count in either case.
*/

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                count+=2;
                set.remove(s.charAt(i));
            }
            else set.add(s.charAt(i));
        }
        if(!set.isEmpty()) count++;
        return count;
    }
}