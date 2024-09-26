// Time Complexity : O(N)
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/* 1. initialize a map with 0 sum happened once.
 * 2. loop through each element in the array and find the cumulative sum.
 * 3. if sum-k already exist in the map means from that index we have a sub array makes sum k.
 * 4. increase the count by the number of ocurences
 * 5. update the map value by +1 or insert new with value 0.  
 * 
 */
import java.util.HashMap;

public class SubarraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3};
		int k=3;
		System.out.println(new SubarraySumEqualsK().subarraySum(nums, k));
	}
}
