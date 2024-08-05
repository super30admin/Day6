public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize the map with sum 0 at index -1
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // Check if there is a prefix subarray that sums to (sum - k)
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            // Add the current cumulative sum to the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
