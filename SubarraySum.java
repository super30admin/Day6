// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.*;


class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int rsum = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            rsum += nums[i];
            if(map.containsKey(rsum-k)){
                result += map.get(rsum-k);
            }
            if(map.containsKey(rsum)){
                map.put(rsum, map.get(rsum)+1);
            }
            else{
                map.put(rsum,1);
            }
        }

        return result;
    }

    public static void main(String[] args){
        SubarraySum ss = new SubarraySum();
        int [] nums = new int[]{1,1,1};
        System.out.println(ss.subarraySum(nums, 2));
        nums = new int[]{1,2,3};
        System.out.println(ss.subarraySum(nums, 3));
    }
}