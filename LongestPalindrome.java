class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0 || s == null) return 0;
        int count = 0;
        HashSet<Character> hs = new HashSet<Character>();
        for(int i =0; i < s.length(); i++){
            
            if(hs.contains(s.charAt(i)))
            {
                hs.remove(s.charAt(i));
                count++;
            }
            else
            {
                hs.add(s.charAt(i));
            }
            
        }
        if(!hs.isEmpty())
            return 2*count + 1;
        else
            return 2*count;
    }
}

Time Complexity : O(N)
Space Complexity : O(N)
Code Working on LeetCode: yes

Approach here is to check if we have encountered a character before if yes then increase the count else just add the character.

For example : s="aabb"

a will be added on first iteration then on second interation we encounter 'a' so we will remove it and increase the count.
Similarly for b.
Since the hashset is empty the longest palindrome will be of length 4.