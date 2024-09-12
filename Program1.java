//560. Subarray Sum Equals K

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
        
    }
}

/*
Complexity Analysis

Time complexity : 
O(n). The entire nums array is traversed only once.

Space complexity : 
O(n). Hashmap map can contain up to n distinct entries in the worst case.
*/