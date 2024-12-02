// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
import java.util.HashMap;

class subarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sMap = new HashMap<>();
        int count = 0;
        int rSum = 0;
        sMap.put(0,1); //number of times 0 has occured
        if(nums == null || nums.length == 0){
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            rSum = rSum + nums[i];
            if(sMap.containsKey(rSum-k)){
                count += sMap.get(rSum-k);
            }
            if(sMap.containsKey(rSum)){
                sMap.put(rSum, sMap.get(rSum) + 1);
            }
            else{
                sMap.put(rSum, 1);
            }
        }
        return count;
    }
}