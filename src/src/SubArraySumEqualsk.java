


import java.util.HashMap;
import java.util.Map;


public class SubArraySumEqualsk {

    //TC : O(n^2) where n is the length of the string given
//SC : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

    //the approach taken is that every subarray is considered and the sum is calculated on the go.
//if the sum is equal to k, then increase the counter.
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum=0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    //TC : O(n) where n is the length of the string given
//SC : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


    //The main idea of this approach is that sum[i,j] = sum[0,j] - sum[0,i-1]. Therefore, as we traverse the array,
    //we can store the sum till that index and check whether the currentSum-k is present in the map. If yes then increment count by the value present
    //else just add the entry in the map.
    public int subarraySum_approachTwo(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> preSum = new HashMap<>();

        //we add (0,1) for the case where sum - k = 0
        preSum.put(0, 1);


        for (int num : nums) {
            sum += num;

            //sum[i,j] = sum[0,j] - sum[0,i-1]
            //k = sum - hashMapkey . Therefore hashMapKey = sum - k
            //hence we check for the count of such sums (sum-k) and increase count by that
            if (preSum.containsKey(sum - k)) {
                count += preSum.get(sum - k);
            }

            //increment count for the same same or add a new entry
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
