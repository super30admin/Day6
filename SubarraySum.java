package Day7;

import java.util.HashMap;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {

        //Edge case
        if(nums == null || nums.length == 0) return 0;

        int count = 0;
        int rSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i=0; i<nums.length; i++){
            rSum += nums[i];

            int compliment = rSum - k;

            if(map.containsKey(compliment)){
                //adding value corrsponding to compliment existing in HashMap
                count += map.get(compliment);
            }

            //anyway we put or update in HashMap
            if(!map.containsKey(rSum)){
                map.put(rSum, 1);
            }
            else{
                map.put(rSum, map.get(rSum)+1);
            }
        }

        return count;
    }

    public static void main(String args[]){
        SubarraySum ob = new SubarraySum();

        int[] nums = new int[]{3,4,7,2,-3,1,4,2,0,1};
        System.out.println("Number of sub arrays giving sum of target " + ob.subarraySum(nums,7));
    }
}
