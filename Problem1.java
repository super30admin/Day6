// Time Complexity : O(n) - n: length of array
// Space Complexity : O(n) - map may contain n distinct sums
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : understanding why to compare (sum-k) was little confusing

import java.util.*;

public class Problem1 {

    public static int subArraySum(int[] nums, int k){
        int count = 0, sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }

        return count;
    }

    public static void main(String[] args){
        int[] nums = {1,-1,3,-3,2,1};
        System.out.println(subArraySum(nums, 0));
    }
}