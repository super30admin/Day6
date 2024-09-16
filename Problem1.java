Time Complexity: O(n)
Space Complexity: O(n)
Ran successfully on Leetcode? : yes.

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int rSum = 0, count = 0;
        
        if(nums.length == 0) return count;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int i = 0; i < nums.length; i++) {
            
            rSum += nums[i];
            
            if(map.containsKey(rSum - k)) {
                count += map.get(rSum - k);
            }
            
            if(map.containsKey(rSum)) {
                map.put(rSum, map.get(rSum) + 1);
            } else {
                map.put(rSum, 1);
            }
            
            
        }
        
        return count;
        
    }
}
