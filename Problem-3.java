class Solution {
    // Time Complexity : O(N) where n is the size of input array
    // Space Complexity : O(N) - hashmap store n entries
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : Nope
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        for(Character c: s.toCharArray()) {
            //see it is a combinaton of left and rright to be equal to make it a palindrome. So we try to just negate the pair in the set by adding and removing.
            
            if(set.contains(c)) set.remove(c);
            else
                set.add(c);
            
        }
        // corner case: when set is of len 1 or 0 it means we can createe a palinidrome by expanding around the center and placing all other characters in left and rright index
        if (set.size() <= 1) return s.length();
        
        return s.length() - set.size() + 1;
    }
}
