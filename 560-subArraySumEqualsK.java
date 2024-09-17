//Approach: Using the Prefix sum and HashMap
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(N)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int count = 0;
        
        map.put(0, 1); //default value
        
        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            if(map.containsKey(rSum - k)){ //Prefix Sum
                count += map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        
        return count;
    }
}