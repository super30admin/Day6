// Time Complexity : O(N)
// Space Complexity : 0(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length <=1) return 0; // Check is the array provided is null or empty. If yes, then return 0
        int max=0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); // Putting values in Map, for the algorithm to work.
        for(int i=0; i< nums.length; i++){
            sum = nums[i] == 0 ? sum -1 : sum +1; // If nums[i] is equal to 0 then -1 from sum, if not then +1 in sum. 
            if(!map.containsKey(sum)){ // Check if Sum is not present in the map
                map.put(sum, i); // if not then present, then add sum to the map
            }else{
                max = Math.max(max, i - map.get(sum)); // if not present, then change max if current value of max is less than i - value present at sum.
            }
        }
        return max; // return sum at the end
    }
}