// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int rsum = 0;
        int diff = 0;

        //initialize with 0th element so that the first integer is factored
        map.put(0, 1);

        for(int i=0; i<nums.length; i++){
            //calculate the running sum
            rsum = rsum + nums[i];
            diff = rsum - k;

            //check if the difference between k and running sum exists in map
            //if not, add the rsum and initialize with 1
            if(map.containsKey(diff))
                count = count + map.get(diff);
            map.put(rsum, map.getOrDefault(rsum, 0) + 1);
        }
        return count;
    }
}