// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nO

/* Approach: We go by an running sum approach, where we sum each element as we iterate over them, +1 if it is 1 and -1 if it is 0. We then see
the longest subarray possible by storing the first position of the running sum in our hash map.  */

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>(); // storing integer to integer value
        int max = 0;
        int rsum = 0;
        map.put(rsum, -1); // putting initial entry for [0,1] question
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                rsum = rsum + 1;
            }else{
                rsum = rsum - 1;
            }
            if(map.containsKey(rsum)){
                max = Math.max(max, i - map.get(rsum)); // subtracting current index from first position
            }else{
                map.put(rsum, i); // create entry of rsum
            }
        }
        return max;
    }
}