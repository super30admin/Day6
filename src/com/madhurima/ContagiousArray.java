/*
    Time Complexity = O(N) as iterating through entire array
    Space Complexity = O(N) filling up HashMap of unknown size
    Did this code successfully run on Leetcode : yes
 */


package com.madhurima;

import java.util.HashMap;

public class ContagiousArray {
}

class SolutionB1 {
    public int findMaxLength(int[] nums) {

        if(nums == null || nums.length == 0 || nums.length == 1){
            return 0;
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        int rSum = 0;
        hm.put(0,-1);
        int maxLen = 0;
        int start = -1;
        int end = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                rSum = rSum + 1;
            }else{
                rSum = rSum - 1;
            }

            if(hm.containsKey(rSum)){
                if(maxLen < i - hm.get(rSum)){
                    // maxLen = Math.max(maxLen, i - hm.get(rSum));
                    maxLen =  i - hm.get(rSum);
                    end = i;
                    start = hm.get(rSum) + 1;
                }

            }else{
                hm.put(rSum, i);
            }

        }

        System.out.println("startIdx = " + start + " , endIdx = " + end);

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0};
        SolutionB1 s = new SolutionB1();
        System.out.println(s.findMaxLength(arr));
    }

}
