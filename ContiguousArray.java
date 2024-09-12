// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map =new HashMap<>();
        map.put(0, -1);
        
        for(int i=0; i<nums.length;i++) {
            prefixSum += nums[i] == 0 ? - 1 : nums[i];
            
            if(map.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            } else {
                map.put(prefixSum,i);
            }
        }
        
        return maxLen;
    }
}
