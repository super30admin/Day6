// Contiguous Array

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // to get the initial sub-array
        int rSum = 0,  max = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 0){
                rSum--;
            }
            else{
                rSum++;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max, i-map.get(rSum));
            }
            else{
                map.put(rSum, i);
            }

        }
        return max;

    }
}