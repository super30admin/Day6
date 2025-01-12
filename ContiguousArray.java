// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        

        // [0,1,1,1,0,0,1,0, 0, 0,1,1]
        // -1,0,1,2,1,0,1,0,-1,-2,-1,0
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer,Integer> hMap = new HashMap<>();
        int max = 0;
        hMap.put(0, -1);
        int rSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                rSum = rSum - 1;
            }else{
                rSum = rSum + 1;
            }

            if(!hMap.containsKey(rSum)){
                hMap.put(rSum,i);
            }else{
                max = Math.max(max , i - hMap.get(rSum));
            }
        }

        return max;
    }
}
