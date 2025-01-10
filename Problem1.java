import java.util.HashMap;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No
//Approach is use to running sum as there are only 2 values 0 & 1 if 0 occurs the rsum will be rsum-1 and for 1 it'll be rsum +1
class Problem1 {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int rSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);//because to handle situation like[1,0]
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                rSum--;
            }
            if(nums[i]==1){
                rSum++;
            }
            if(map.containsKey(rSum)){
                ans = Math.max(ans,i - map.get(rSum));//get the max between the curr ans and the index -(first index of that value)
            }else{
                map.put(rSum,i);
            }
        }
        return ans;
    }
}