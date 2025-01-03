package Hashing2;

import java.util.HashMap;

class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int count =0;
        int runningSum=0;
        int diff = 0;
        HashMap<Integer, Integer> sum_map = new HashMap<>();
        sum_map.put(0,1);
        for(int i=0;i<nums.length;i++){
            runningSum+=nums[i];
            diff = runningSum-k;
            if(sum_map.containsKey(diff)){
                int freq = sum_map.get(diff);
                count+=freq;
            }
            sum_map.put(runningSum,sum_map.getOrDefault(runningSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubArraySumEqualsK obj = new SubArraySumEqualsK();
        int  [] nums = {1,1,1};
        System.out.println(obj.subarraySum(nums, 2));
    }
}