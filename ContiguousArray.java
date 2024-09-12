import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(N) where N is the length of the array
// Space Complexity : O(N) where N is the length of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * We will be using hashmap to key track of running Sum and index. Key = rSum, Value= index
 * To eliminate the edge case we put (0,-1) ie rSum=0 at -1 index
 * For input 0 we rSum-1 and for input 1 we do rSum+1
 * Idea over here is if the same rSum if occurring mutiple times, then the subarray between both the index is balanced subarray
 * It has same no. of 0's and 1's
 * */

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int rSum=0, maxLength=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //to eliminate the edge case
        map.put(0,-1);

        for(int i=0; i<nums.length; i++){
            //assign value = -1 for 0 And value=1 for 1 as input
            int value = nums[i]==0? -1 : 1;
            rSum+=value;
            //if the rSum exists is in the map then get the length of balanced subarray and
            //compare with the maxLength
            if(map.containsKey(rSum)){
                int length = i-map.get(rSum);
                maxLength = length>maxLength ? length : maxLength;
            }
            else {
                map.put(rSum,i);
            }
        }
        return maxLength;
    }
}
