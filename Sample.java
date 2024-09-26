import java.util.*;

class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Your code here along with comments explaining your approach
    /*
    1. if we know the sum(0, i) and sum(0, j), we can get sum(i, j) = sum (0, j) - sum(0, i).
    2. map the sum to number of subarrays which has that sum.
    3. So we will store the sums of continuous array while traversing the array and we will check the if the (sum - k)
    exists in the map.
    */

    public int subarraySum(int[] nums, int k) {
        
        int sum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            
            if(map.containsKey(sum - k))
                count += map.get(sum-k);
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
        
    }


    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Your code here along with comments explaining your approach
    /*
    */

    public int findMaxLength(int[] nums) {
        
        int len = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);
        
        for(int i=0; i<nums.length; i++) {
            count += (nums[i] == 1 ? 1 : -1);
            
            if(map.containsKey(count)) {
                len = Math.max(len, i - map.get(count));
            }
            else {
                map.put(count, i);
            }
        }
        
        return len;
        
    }

    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No


    // Your code here along with comments explaining your approach
    /*Longest Palindrome
    */

    public int longestPalindrome(String s) {
        int cnt = 0;
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()) {
            if(set.contains(c)) {
                set.remove(c);
                cnt++;
            }
            else {
                set.add(c);
            }
        }
        
        if(!set.isEmpty())
            return cnt*2+1;
        
        return cnt*2;
    }

}