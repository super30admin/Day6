class Solution {
    // Time complexity: O(n)
    // Space complexity: O(n)
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // this operation is important, or we may miss some arrays
        // for instance: [3, 4, 7, ...], if we do not add this, we will miss [3, 4]
        map.put(0, 1);
        int preSum = 0,  count = 0;
        for(int i = 0; i < nums.length; i++){
            preSum = preSum + nums[i];
            if(map.containsKey(preSum - k)){
                count = count + map.get(preSum - k);
            }
            if(!map.containsKey(preSum)){
                map.put(preSum, 1);
            }else{
                map.put(preSum, map.get(preSum) + 1);
            }
        }
        return count;
    }
}