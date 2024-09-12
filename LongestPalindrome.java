public class LongestPalindrome {
  /**
   * Problem: https://leetcode.com/problems/longest-palindrome/
   * Time Complexity: O(n)
   * Space Complexity: O(1)

   * Did this code successfully run on Leetcode : Yes
   * Any problem you faced while coding this : No
   * 
   * Approach: To make the loingest possible Palindrome, we can pick all the characters that occur even number of times.
   *            and pick 1 less character on characters occuring odd number of times. And to place them in the middle, pick 1 extra odd character.
   * 
   */

  public int longestPalindrome(String s) {
    Map<Character, Integer> map = new HashMap<>();
    
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        
        map.put(c, map.getOrDefault(c, 0)+1);
    }

    int length = 0;
    boolean hasOddCount = false;
    
    for(char c : map.keySet()){
        int count = map.get(c);
        
        if(count%2 == 0){ // When the counts are even, we can pick all characters.
            length += count;
        } else { // When the counts are odd
            length += (count - 1); // Just pick the even number of characters.
            hasOddCount = true;
        }
    }
    
    return (hasOddCount) ? length+1 : length;
  }
}
