// Time Complexity : The time complexity is O(n) where n is the length of the array since we are iterating through the array only once.
// Space Complexity : The space complexity is O(n) because in the map we are storing the sum and there could be a possibilty of n distinct sums.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {

        int output = 0;
        int sum = 0;

        // HashMap which maps the sum to its index.
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){

            // If value is 1, increment the sum
            if(nums[i] == 1){
                sum++;
            }
            // If value is 0, decrement the sum
            else{
                sum--;
            }

            // If sum exits in the map, find the length of the subarray
            if(map.containsKey(sum)){
                output = Math.max(output,i-map.get(sum));
            }
            // If sum doesn't exist, add it to the map
            else{
                map.put(sum,i);
            }

        }

        return output;

    }
}