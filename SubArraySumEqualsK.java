//Time Complexity - O(n)
//Space Complexity - O(n)
//Leetcode - Yes
import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int rSum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)){
                count = count + map.get(rSum - k);
            }
            map.put(rSum,map.getOrDefault(rSum,0) + 1);

        }
        return count;
        
        
    }
}