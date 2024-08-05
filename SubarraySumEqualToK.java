//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.HashMap;

public class SubarraySumEqualToK {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int runningSum=0;
        if(nums==null){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            runningSum +=nums[i];
            if(map.containsKey(runningSum-k)){
                count +=map.get(runningSum-k);
            }
            if(!map.containsKey(runningSum)){
                map.put(runningSum, 1);
            }
            else{
                map.put(runningSum, map.get(runningSum)+1);
            }

        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        int k = 3;
        int result = subarraySum(nums, k);
        System.out.println(result);
    }
}
