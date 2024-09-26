// Time Complexity : O(N)
// Space Complexity : O(1)  {26 characters only}
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach
/**
 * This question can be solved using three methods: Hashmap, Hashset and simple array. 
 * All give asymptotically same time and space complexity.
 * To solve using a hashset is the simplest approach. That's why I have used this method.
 * 1. First initialized maxLength var which is the max length of the palindrome.
 * 2. Iterate over all the characters.
 *  3. If the character is not present in the hashset, add it.
 *     If it is present, remove it from it and increment +2 to the maxLength.
 * 4. After completing the iteration over all characters:
 *      If hashset is non-empty: Increment +1 to the maxLength
 * 5. return maxLength
 *         
 */

class Solution {
    public int longestPalindrome(String s) {
        

        if(s.length() == 0 || s == null) return 0;
        HashSet<Character> set = new HashSet<Character>();
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(!set.contains(current)){
                set.add(current);
            }
            else{
                set.remove(current);
                maxLength += 2;
            }
        }
        
        if(!set.isEmpty()){
            maxLength += 1;
        }
    return maxLength;
    }
        
}