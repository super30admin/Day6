import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None.

class subArrSum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum   = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if(hashMap.containsKey(sum - k)) {
                count += hashMap.get(sum - k);
            }
            
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);

        }
        return count;
    }
}

