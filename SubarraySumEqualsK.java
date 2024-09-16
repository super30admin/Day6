package com.hashing2;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        int currentSum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<> ();
        map.put(0,1);
        for(int i = 0 ;i< nums.length;i++){
            currentSum+=nums[i];
            if(map.containsKey(currentSum-k)){
                count += map.get(currentSum-k);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }

        return count;


    }

    public static void main(String[] args) {
        SubarraySumEqualsK sol = new SubarraySumEqualsK ();

        System.out.println (sol.subarraySum (new int[]{1,1,1},2));
    }


}
