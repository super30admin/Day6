class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCounterMap = new HashMap<>();

        sumCounterMap.put(0, 1);
        int rSum = 0, count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            rSum += nums[i];
            if(sumCounterMap.containsKey(rSum - k))
            {
                count += sumCounterMap.get(rSum - k);
            }
            sumCounterMap.put(rSum, sumCounterMap.getOrDefault(rSum , 0) + 1);
        }

        return count;
    }
}