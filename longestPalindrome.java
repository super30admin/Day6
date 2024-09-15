Time Complexity-O(n)
Space Complexity-O(n)

Leetcode Submission-Successful

class Solution {
   public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
       int count=0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) 
            {
                count+=2;
                set.remove(c);
            }
            else set.add(c);
        }

        return count + (set.isEmpty() ? 0 : 1);
    }
}
