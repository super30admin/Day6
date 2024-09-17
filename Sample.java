// Problem 1
// Time Complexity : O(n)
// Space Complexity : O(n) -> extra space for HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Algorithm
// 1 - initialize hashmap, sum and count
// 2 - iterate over array
// 3 - calculate sum
// 4 - check if sum - k present as key
// 5 - map sum to value
class Solution {
    public int subarraySum(int[] nums, int k) {
        // 1
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);

        // 2
        for(int i=0; i<nums.length; i++) {
            // 3
            sum += nums[i];

            // 4
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            // 5
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}

// Problem 2
// Time Complexity : O(n)
// Space Complexity : O(n) -> extra space for HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Algorithm
// 1 - Initiliaze HashMap, sum and maxLength
// 2 - iterate through array
// 3 - check for 0 or 1
// 4 - check for mapping and calculate maxLength
class Solution {
    public int findMaxLength(int[] nums) 
    {
        // 1
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        
        int sum = 0;
        int maxLength = 0;
        
        // 2
        for(int i=0; i<nums.length; ++i) {
            // 3
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            
            // 4
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum,i);
            }
        }
        
        return maxLength;
    }
}

// Problem 3
// Time Complexity : O(n)
// Space Complexity : O(n) -> extra space for HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Algorithm
// 1 - initiliaze HashMap
// 2 - iterate over char array
// 3 - iterate over map
// 4 - conditions
class Solution {
    public int longestPalindrome(String s) {
        // 1
        Map<Character, Integer> map = new HashMap<>();
        char[] sArray = s.toCharArray();
        
        // 2
        for (char c : sArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        if (map.size() == 1) {
            return s.length();
        }
        
        int result = 0;

        // 3
        for(char c : map.keySet()) {
            int freq = map.get(c);

            // 4
            if (freq % 2 == 0) {
                result += freq;
            } else if (result == 0 || (result % 2 == 0 && freq % 2 != 0)) {
                result += freq;
            } else if (result % 2 != 0 && freq % 2 != 0) {
                result += freq - 1;
            }
        }
        
        return result;
    }
}