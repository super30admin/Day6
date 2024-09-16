import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        
        int rSum=0;
        int max=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                rSum=rSum-1;
            } else {
                rSum = rSum+1;
            }
            
            if(hm.containsKey(rSum)){
                max = Math.max(max, i-hm.get(rSum));
            } else {
                hm.put(rSum,i);
            }
        }
    return max;    
    }
}