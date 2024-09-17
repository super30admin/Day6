// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArray {
    static int findMaxLength(int[] nums) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,- 1);
        int prefixSum = 0;
        int maxLength = 0 ;
        for (int i = 0 ; i < nums.length; i++) {
            int num = nums[i];

            prefixSum +=  num == 0 ? -1 : 1;

            if (map.containsKey(prefixSum)){
               int length = i - (map.get(prefixSum));
                maxLength = Math.max(maxLength,length);
            }
            else {
                map.put(prefixSum, i);
            }
        }
        return  maxLength;
    }

    public  static  void main(String [] args){
        int[] nums = {0, 1};
        System.out.println("length is: " +ContinuousSubArray.findMaxLength(nums));
    }

}
