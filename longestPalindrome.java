// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : had confused in case of odd amount of frequency

// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap();
        
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        int res = 0;
        
        List<Integer> list = new ArrayList(map.values());
        
        for(int i : list) {
             res += i/2 * 2;
            if(res % 2 == 0 && i % 2 == 1)
                res++;
            
        }
        return res;
    }
}