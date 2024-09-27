/*
    Time Complexity = O(N) as iterating through entire array
    Space Complexity = O(N) filling up HashMap of unknown size
    Did this code successfully run on Leetcode : yes
 */

package com.madhurima;

import java.util.HashMap;

public class SubArraySum {
}

class SolutionC1 {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        int rSum = 0;
        hm.put(0, 1);
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            rSum = rSum + nums[i];

            //first update the count
            if(hm.containsKey(rSum - k)){
                count = count + hm.get(rSum - k);
            }

            hm.put(rSum, hm.getOrDefault(rSum, 0) + 1);

            // count = count + hm.getOrDefault(rSum - k, 0);
        }

        return count;


    }

    public static void main(String[] args) {
        SolutionC1 s = new SolutionC1();
        int arr[] = {1,1,1};
        int k = 2;
        System.out.println(s.subarraySum(arr, k));
    }


}
