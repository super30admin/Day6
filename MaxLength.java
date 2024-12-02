// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.*;

class MaxLength {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int rsum = 0;
        int max = 0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) rsum--;
            else rsum++;
            if(map.containsKey(rsum)){
                max = Math.max(max,i - map.get(rsum));
            }
            else{
                map.put(rsum,i);
            }
        }
        return max;
    }

    public static void main(String[] args){
        MaxLength ml = new MaxLength();
        int[] nums = new int[]{0,1};
        System.out.println(ml.findMaxLength(nums));
        nums = new int[]{0,1,1,0,1,1,0,0};
        System.out.println(ml.findMaxLength(nums));
    }
}