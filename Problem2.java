/*
    LC - 525. Contiguous Array
    TC - O(n)
    SC - O(n)
    Did this code successfully run on Leetcode : Yes
    Approach - Traverse the array, calculate the running sum & check if the rSum exist in hashmap, if exist, calculate the length and update the max if needed.
        else if the element not exist in map, then put it in map.
        for edge base case, add (0,-1).

        Key Logic : Running Sum (if the element is 1, then add 1, else subtract -1)
*/

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum =0, max =0;
        map.put(rSum, -1);
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 1) {
                rSum = rSum + 1;
            } else {
                rSum = rSum - 1;
            }
            if(map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;
    }
}