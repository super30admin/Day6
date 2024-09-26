/*
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        rSum = ans = 0
        cached = {}
        cached[0] = 1
        
        for i in range(len(nums)):
            rSum += nums[i]
            compliment = rSum - k
            
            if compliment in cached:
                ans += cached[compliment]
            
            if rSum not in cached:
                cached[rSum] = 1 
            else:
                cached[rSum] += 1
                
        return ans
*/

// Time Complexity : O(n) where n is size of array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: I maintained a hashmap of sum at every index and checked whether it is 
// present in the map or not

class Solution {
    public int subarraySum(int[] nums, int k) {
       if (nums == null || nums.length == 0){
           return 0;
       } 
        
        int ans = 0, rSum = 0;
        HashMap<Integer, Integer> cached = new HashMap<>();
        cached.put(0,1);
        for (int i=0; i<nums.length; i++){
            rSum += nums[i];
            int compliment = rSum - k;
            if (cached.containsKey(compliment)){
                ans += cached.get(compliment);
            }
            
            if (!cached.containsKey(rSum)){
                cached.put(rSum, 1);
            }else{
                cached.put(rSum, cached.get(rSum) + 1);
            }
            
        }
        
        return ans;
    }
}
            