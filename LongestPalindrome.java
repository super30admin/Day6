// Time Complexity : O(n)
// Space Complexity : )(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Approach

/**
 * we store counts of each character in a hashmap.
 * if the count of a character is even, we can use it fully in the palindrome length. we remove the entry from the hashmap
 * if count of a character is odd, we can use (count - 1) and update the hashmap entry.
 * 
 * In the end, we can include one more character as the middle element of our palindrome. (check if the map has size greater than 0)
 */

// https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        int ans = 0;
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        
        while(iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            
            int cur_count = entry.getValue();
            
            if (cur_count % 2 == 0) {
                ans += cur_count;
                iterator.remove();
            } else {
                ans += cur_count - 1;
                entry.setValue(1);
            }
        }
        
        if (map.size() > 0) {
            ans += 1;
        }
        
        return ans;
    }
}