class Solution {
    
    // Time Complexity: O(n)
    // Time Complexity: O(n)
    
    public int subarraySum(int[] nums, int k) {
        int currSum = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            int complement = currSum - k;
            
            if(map.containsKey(complement))
                result += map.get(complement);

            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }
        return result;
    }
}