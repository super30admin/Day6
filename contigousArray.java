class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> sumToIndexMap = new HashMap<>();
        sumToIndexMap.put(0, -1);
        int rSum = 0, len = 0, maxLen = 0;
        for(int i = 0; i < nums.length; i++)
        {
            rSum += nums[i] == 1 ? 1 : -1;

            if(sumToIndexMap.containsKey(rSum))
            {
                len = i - sumToIndexMap.get(rSum);
                maxLen = Math.max(len, maxLen);
            }
            else
            {
                sumToIndexMap.put(rSum, i);
            }
        }

        return maxLen;
    }
}