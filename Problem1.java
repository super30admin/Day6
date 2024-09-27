class Solution {
    public int subarraySum(int[] nums, int k) {
        int rollingSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ret = 0;
        for(int i=0;i<nums.length;i++){
            rollingSum += nums[i];
            ret += map.getOrDefault(rollingSum - k,0);
            map.put(rollingSum, map.getOrDefault(rollingSum,0)+1);
        }
        return ret;

    }
}