//Time complexity: O(n)
//Space complexity: O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        //map to store the running sum as key and the values as the ocurrences of how many times the rSum - k as happened.
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int rSum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            rSum = rSum + nums[i];
            //if running sum - target has happened before that we will add the number of occurence to the count
            if(map.containsKey(rSum - k)) {
                count = count + map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}