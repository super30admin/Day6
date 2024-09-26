/**
 * Approach : Maintain a DataStructer to put a character's count or itself.
 *            if it occurs twice increase the count for palindrome by 2
 *            at the end check if there are any elements remaining or not, if not empty return count increased by 1 for middle element 
 * 
 * TC : O(n) SC : O(1) because the set of characters will be limited 
 */
class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count+=2;
            }else {
                set.add(c);
            } 
            
        }
        if(!set.isEmpty()) count++;
        return count;
    }
}