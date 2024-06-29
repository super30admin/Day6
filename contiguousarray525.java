// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    /*
    [0,1,1,0,1,1,0,1,1,0,1,1,0,0,0,1,0,1,1,0,0,1,1,0]
     -1 0 1 0 1 2
    */
    public int findMaxLength(int[] nums) {
        int rsum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                rsum = rsum +1;
            }
            else{
                rsum = rsum -1;
            }
            if(map.containsKey(rsum)){
                res = Math.max(res, i-map.get(rsum));
            }
            else{
                map.put(rsum, i);
            }
        }
        return res;
    }
}