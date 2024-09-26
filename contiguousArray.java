// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        HashMap<Integer, Integer> mp = new HashMap<>();
        int cnt = 0;
        int max1 = 0;
        mp.put(0, -1);
        for (int i =0; i < nums.length; i++){
            if(nums[i] == 0){
                cnt = cnt - 1;
            }
            if(nums[i] == 1){
                cnt = cnt + 1;
            }
            if(!mp.containsKey(cnt)){
                mp.put(cnt, i);
            }
            else{
                max1 = Math.max(max1, i-mp.get(cnt));
            }
        }
        return max1;
        
    }
}