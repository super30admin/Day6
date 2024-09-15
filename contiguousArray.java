// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution{
    public int findMaxLength(int[] nums) {
        // return 0 if array is null or its length is zero
        if(nums == null || nums.length == 0) return 0;
        // initalize max and running sum
        int max = 0;
        int rSum = 0;
        // create a hashmap to store running sum along with the index
        HashMap<Integer, Integer> map = new HashMap<>();
        // rSum = 0  at index -1 to avoid ignoring cases like [0,1]
        // store it in hashmap
        map.put(0, -1);

        for(int i = 0; i < nums.length; i++){
            // calculate the running sum for every element of the array
            // treat 1 as i and 0 as -1 while calculating the running sum
            if(nums[i] == 0) rSum--;
            else rSum++;
            if(map.containsKey(rSum)){
                // if the running sum has already occured before and stored in the hashmap,
                // update the maximum size by calcuating the difference between the index
                max = Math.max(max, i - map.get(rSum));
            } else {
                // if the running sum does not exist in the hashmap, add it to the hashmap
                map.put(rSum, i);
            }
        }
        return max;
    }
}