//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        int cnt = 0;
        int prefixSum = 0;
        for(int i=0;i<nums.length;i++) {
            prefixSum += nums[i];
            if(map.containsKey(prefixSum - k)) {
                cnt += map.get(prefixSum - k);
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum,0) + 1);
        }
        
        return cnt;
    }
}
