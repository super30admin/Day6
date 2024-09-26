/*
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        cached = {0:-1}
        max_count = rSum = 0
        
        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1
                
            if rSum in cached:
                max_count = max(max_count, i - cached[rSum])
            
            else:
                cached[rSum] = i
        
        return max_count
*/

// Time Complexity : O(n) where n is size of array
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Everytime a number is encountered I maintain a hashmap of running sum
// and its index. If it is present in map then till that point the array is having equal no of 1s and 0s and we calculate the length 

class Solution {
    public int findMaxLength(int[] nums) {
        if (nums  == null || nums.length == 0)
            return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum = 0, max_count = 0;
        
        for (int i=0; i<nums.length; i++){
            rSum = nums[i] == 0 ? rSum - 1: rSum + 1;
            
            if (map.containsKey(rSum)){
                max_count = Math.max(max_count, i-map.get(rSum));
            }else{
                map.put(rSum, i);
            }
        }
        return max_count;
    }
}