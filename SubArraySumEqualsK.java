/**
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int runningSum = 0;
        hmap.put(0,1);
        for(int i = 0; i < nums.length; i++){
            runningSum = runningSum + nums[i];
            int compliment = runningSum - k;
            if(hmap.containsKey(compliment)){
                count = count + hmap.get(compliment);
            }
            if(!hmap.containsKey(runningSum)){
                hmap.put(runningSum,0);
            }
            
            hmap.put(runningSum,hmap.get(runningSum)+1);
        }
        return count;
    }

    public static void main(String args[]){
        int[] myArr = new int[]{1,1,1};
        int target = 2;
        SubArraySumEqualsK obj = new SubArraySumEqualsK();
        System.out.println(obj.subarraySum(myArr, target));
    }
}