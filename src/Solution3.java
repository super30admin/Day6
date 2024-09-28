class Solution3 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int runningSum = 0;
        int subArrayCount = 0;
        for(int i= 0; i<nums.length; i++){
            // We'll first visit each element in the array and update the running sum.
            // Concurrently we need to find whether we have seen this sum previously.
            runningSum += nums[i];
            if(map.containsKey(runningSum - k)){
                subArrayCount += map.get(runningSum-k);
            }
            if(!map.containsKey(runningSum)){
                map.put(runningSum, 0);
            }

            map.put(runningSum, map.get(runningSum)+1);
        }
        return subArrayCount;
    }
}