//Time Complexity : O(N)
//Space Complexity : O(N);
// Did this code successfully run on Leetcode :

// Your code here along with comments explaining your approach
class SubArraySum {

    public int subarraySum(int[] nums, int k) {
        if(nums == null && nums.length == 0)
            return 0;
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++) {
            prefixSum += nums[i];
            if(map.containsKey(prefixSum - k)) {
                count +=  map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}