// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. create a hash map and insert count 0 at index -1.
 * 2. if it is 1 return +1, else -1. calculate count.
 * 3. map holds when did that count occurred first the first time index.
 * 4. every iteration check current max length or current index-last occurred which is greater hold that value.  
 */

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
	public int findMaxLength(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,0,1,1,1,0,0};
		System.out.println(new ContiguousArray().findMaxLength(nums));
	}
}
