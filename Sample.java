// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;

        int even = 0, odd = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] % 2 == 0) even += freq[i];
            else {
                even += (freq[i] - 1);
                odd++;
            }

        }

        return odd == 0 ? even : even + 1;
    }
}


//Time complexity:O(N)
//Space complexity : O(N) 

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] == 0) {
               nums[i] = -1;
           }
       }
        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
            if (map.containsKey(sum)) {
                int last = map.get(sum);
                max = Math.max(max, i - last);
            } else {
                map.put(sum, i);
            }
       }
        return max;
    }
}

//Time complexity: O(N)
//Space complexity:O(N) 

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        map.put(0, 1);
        int sum = 0;
                
        for(int i : nums) {
            sum += i;            
            if( map.containsKey(sum-k) )
                count += map.get(sum-k);            
            map.put(sum, map.getOrDefault(sum, 0) + 1);            
        }
        
        return count;        
    }
}

















