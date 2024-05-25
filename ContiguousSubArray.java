//Time Complexity - O(n)
//Space Complexity - O(n)
//Leetcode - Yes
import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length ==0 || nums == null){
            return -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int rSum = 0;
        int max = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                rSum = rSum +1;
            }
            if(nums[i] == 0){
                rSum = rSum - 1;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max,i - map.get(rSum));
            }
            else{
                map.put(rSum,i);
            }

        }
        return max;
    }
}
