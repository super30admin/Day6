import java.util.HashSet;

/* Time Complexity: O(n)
 * Space Complexity:O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 */

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){ //Search - O(1)
                count += 2;
                set.remove(c); //removal - O(1)
            } else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) count++; //isEmpty() - O(1)
         return count;   
    }
}
