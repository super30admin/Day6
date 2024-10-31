// Time Complexity :subarraySum: O(n) , in is number of elements in the array
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing

import java.util.HashMap;

public class Problem1 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum=0;
        int count=0;
        map.put(0,1);
        for(int num: nums){
            rSum += num;
            int cmp = rSum-k;

            if(map.containsKey(cmp)){
                count += map.get(cmp);
            }else{
                map.put(rSum, map.getOrDefault(rSum, 0)+1);
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Problem1 problem1 = new Problem1();
        int[] nums= new int[15];
        nums[0]=3;
        nums[1]=4;
        nums[2]=7;
        nums[3]=2;
        nums[4]=-3;
        nums[5]=1;
        nums[6]=4;
        nums[7]=2;
        nums[8]=0;
        nums[9]=1;



        System.out.println(" Sub array sum equals to k "+problem1.subarraySum(nums, 7));

    }

}
