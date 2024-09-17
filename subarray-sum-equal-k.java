// Time - O(N)
// Space - O(N)

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0 || nums == null) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put( 0, 1);
        
        int count = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
                sum = sum + nums[i];
                if(map.containsKey(sum - k)) {
                    count += map.get(sum-k);
                }                    
                map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
