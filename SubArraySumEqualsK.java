// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SubArraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int rSum = 0;
        map.put(0,1);
        for(int i =0;i< nums.length;i++){
            rSum += nums[i];
            int comp = rSum - k;
            if(map.containsKey(comp)) {
                count += map.get(comp);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);

        }
        return count;
    }
}