// Time Complexity : O(N)
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

    
// Your code here along with comments explaining your approach
/**
 * The first strategy to solve nested array operations, hashing is the best to first come up with.
 * Here I have used HashMap to store(rSum, index)
 * 1. first I inserted (0, -1) to handle the edge case
 * 2. Then I iterated through the numbers in the array nums..
 *      3. Calculated rSum for the current number
 *      4. Checked if it is present in the hashmap
 *          5. If No, insert (rSum, index) in the hashmap
 *          6. Else, calculate the maxLength by ...Math.max(max, currentIndex - value from the Hashmap for that rSum)
 * 7. Return max
 */
class Solution {
    public int findMaxLength(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int rSum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            rSum = nums[i] == 0 ? rSum - 1 : rSum + 1;
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }
            else{
                map.put(rSum, i);
            }
        }
        return max;
        
    }
}