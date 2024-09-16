package com.hashing2;

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {

        if(nums == null || nums.length == 0) return 0;


        HashMap<Integer, Integer> map = new HashMap<> ();
        int rSum = 0, Max = 0;
        map.put(0,-1);
        for(int i = 0; i<nums.length;i++){
            rSum = nums[i] == 0 ? rSum-1 : rSum+1;

            if(map.containsKey(rSum)){
                Max = Math.max(Max, i-map.get(rSum));
            }
            else{
                map.put(rSum,i);
            }
        }

        return Max;

    }

    public static void main(String[] args) {
        ContiguousArray sol = new ContiguousArray ();

        System.out.println (sol.findMaxLength (new int[]{0,1,0,1,0,1,0,1,1}));
    }

}
