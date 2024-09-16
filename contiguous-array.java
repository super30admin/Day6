// Time Complexity : O(n) {n = nums.length}
// Space Complexity : O(n) {n = nums.length}
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// cosider 0s and -1, where ever substring sum is zero then 0s and 1s count is same.
// put last sum in a map and find sum of substring by substracting sun of revious elements from map.

class Solution {
    public int findMaxLength(int[] nums) {
         Map<Integer,Integer> distMap = new HashMap<>();
        int currSum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) currSum-=1;
            else currSum+=nums[i];
            distMap.put(currSum, i);
        }
        int result = 0;
        int preSum = 0;
        for(int i = 0;i<nums.length;i++){
            if(distMap.containsKey(preSum)){
                int pos = distMap.get(preSum);
                result = Math.max(result, pos-i+1);
                if(pos<=i){
                    distMap.remove(preSum);
                }
            }
            if(nums[i] == 0) preSum-=1;
            else preSum+=nums[i];
        }
        return result;
    }
}