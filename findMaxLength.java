// Time Complexity :O(N) , N is length of array
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Maintain a rsum value and check the occurance

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int rsum = 0, max = 0;
        //imp case to initialize the map with 0th value as -1
        map.put(0, -1);
        for(int i = 0;i<nums.length; i++){
            rsum = nums[i] == 0 ? rsum - 1:rsum + 1;
            if(map.containsKey(rsum)){
                max = Math.max(max, i - map.get(rsum));
            }
            else{
                map.put(rsum, i);
            }
        }
        return max;
    }
}