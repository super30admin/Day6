// Time Complexity = O(n)
// Space Complexity = O(1), since there will be maximum of 26 elements in the hashSet
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0;

        // The hashSet will contain characters in the string
        HashSet<Character> set = new HashSet<>();

        // Itterate over each character in the string
        for (char c : s.toCharArray()) {

            // If we dont have the character in the set then add it
            if (!set.contains(c)) {
                set.add(c);
            }
            // otherwise, remove the char from the set and increment the count by 2
            else {
                count += 2;
                set.remove(c);
            }
        }

        // Check if the set is not empty, add 1 to the count
        if (!set.isEmpty()) {
            count++;
        }

        return count;
    }
}