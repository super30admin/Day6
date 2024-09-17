
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
       int prefixSum = 0;
        int counter = 0;

        for (int num : nums){
            prefixSum += num;
            int excess = prefixSum - k;

            if (map.containsKey(excess)){
                counter += map.get(excess);
                if(map.get(prefixSum) == null){
                    map.put(prefixSum,  1);
                }
                else {
                    map.put(prefixSum, map.get(prefixSum) + 1);
                }
            }
            else {
                map.put(prefixSum, 1);
            }
        }
        return counter;
    }

    public static void main(String [] args){
        int [] nums = {1,1,1};
        System.out.println(SubArraySum.subarraySum(nums, 2));
    }

}
