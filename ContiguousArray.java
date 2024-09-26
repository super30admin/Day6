/**
 * Approach : Maintain the map of running sum as key and index of it as value
 *            Consider 0 as -1 and 1 as +1 for running sum, so whenever sum is same as any previous index, the 1s and 0s betn them will be same
 *            to find the maxSubarray length maintain max varible to check if the current length is greater than any previous.
 * 
 * TC: O(n) SC: O(n)  
 */
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 0, rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            rSum = nums[i] == 0 ? rSum - 1: rSum + 1;
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            } else{
                map.put(rSum,i);
            }
        }
        return max;
    }
}