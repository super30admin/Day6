// Time Complexity : O(N)
// Space Complexity : 0(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0 ) return 0; // Check is the array provided is null or empty. If yes, then return 0
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap <>();
        map.put(0,1); // Putting values in Map, for the algorithm to work.
        for(int i=0;i<nums.length;i++){
            sum += nums[i]; // adding nums[i] to the sum variable
            int compliment = sum - k; // find out the compliment
            if(map.containsKey(compliment)) // check if the compliment is present in the map
            {
                count += map.get(compliment);  // If yes then add the value coresponding to compliment to the count
            }
            if(!map.containsKey(sum)){ // check if sum is not present in the map
                map.put(sum, 1); // if not then add sum and its value as 1 to the map
            }else{
                map.put(sum, map.get(sum) + 1); //if its present, then add 1 to the value corresponding to sum key in the map.
            }
        }
        return count;
    }
}