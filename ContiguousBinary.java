// Time Complexity : O(n) going over the nums array
// Space Complexity : O(n) as using a hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Store the running sum and the earliest index where the running sum has been encountered
while going over the nums array. If the current running sum is present in the hashmap, then
the compliment = current running sum - running sum seen before is the subarray and the difference between them is the length of the subarray.
Compare with max and display the max.
*/
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>(){{
            put(0,-1);
        }};
        if(nums == null || nums.length == 0){return 0;}
        int sum=0, max = 0;
        for(int i=0;i < nums.length;i++){
            sum = (nums[i] == 0? sum+1 : sum-1);                // If 0 -> do -1 else 1 -> do +1
            if(!result.containsKey(sum)){
            result.put(sum, i);
            } else{
            int curr_sum = i - result.get(sum);                 // Current sum = running summ seen now - running sum seen before => Balanced array
            if(curr_sum > max){
                max = curr_sum;                             // Max length comparison and store
            }
        }
        }
        return max;
    }
}