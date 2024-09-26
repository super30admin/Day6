class Solution {
    public int subarraySum(int[] nums, int k) {

        //Maintain a running sum to count of the running sum in this Map
        HashMap<Integer, Integer> rSumMap = new HashMap<>();
        rSumMap.put(0,1);

        int runningSum = 0;
        int retCount = 0;

        for(int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            int diff = runningSum - k;
            if(rSumMap.containsKey(diff)) {
                retCount += rSumMap.get(diff);
            }

            if(rSumMap.containsKey(runningSum)) {
                rSumMap.put(runningSum, rSumMap.get(runningSum) + 1);
            } else {
                rSumMap.put(runningSum, 1);
            }
        }
        return retCount;

    }
}