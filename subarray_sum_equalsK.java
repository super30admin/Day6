//we use hashmap to store the running sum. z = x - y. 
// we do rSum - k at every iteration check of rSum - k is already in hashmap . is exists it means we have a subarray sum of k present
// we then procees to add its occurances to total variable
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int total = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if(map.containsKey(rSum - k)) {
                total += map.get(rSum - k);
            }
            map.put(rSum,map.getOrDefault(rSum,0) + 1);
        }
        return total;
    }
}