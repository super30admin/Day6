import java.util.HashMap;
import java.util.Map;


// Time Complexity : O(N) where N is the length of the array
// Space Complexity : O(N) where N is the length of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * We will be using hashmap to keep track of running Sum and count of indexes where rSum is equal to key. Key = rSum, Value= count of indexes
 * To eliminate the edge case we put (0,1) ie rSum=0 at 1 count (0 at -1 index)
 * Idea over here is to calculate the running sum at each index and find the complement in the hash map to see the difference in the rSum
 * equals to the k
 * */

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums==null|| nums.length==0) return 0;

        int rSum = 0, count=0;
        //MAp with Key=rSum and value=count of the indexes where rsum is equal to key
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //for the edge case
        map.put(0,1);
        //travers the array
        for(int i=0; i<nums.length; i++){
            //get the running sum
            rSum +=nums[i];
            //complement is the rsum we should be looking to get the sum of the subarray to K
            int complement = rSum-k;
            if(map.containsKey(complement)){
                count += map.get(complement);
            }
            //check if rsum is in the map, if yes increment the count by 1 or set the value to 1
            map.put(rSum, map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}
