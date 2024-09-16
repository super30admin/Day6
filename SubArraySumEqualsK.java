//Time Complexity: O(N)
//Space Complexity: Complexity: O(N)
//Runtime: 28 ms, faster than 31.52% of Java online submissions for Subarray Sum Equals K.
//Memory Usage: 41.2 MB, less than 80.17% of Java online submissions for Subarray Sum Equals K.

class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        int result = 0;
        
        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];

            if(map.containsKey(prefixSum-k)){
               result += map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

        }
        return result;
    }
}
