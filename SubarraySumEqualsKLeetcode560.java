//Time Complexity: O(n^2) the loop is run twice on the array
//Space complexity: O(1) No extra space
//Leetcode: Yes
import java.util.HashMap;
public class SubarraySumEqualsKLeetcode560 {
    public int subarraySum (int[] nums, int k) {
        int subarray_count = 0;
        int end = nums.length;
        for (int i = 0; i < end; i++) {
            int sum = 0;
            for (int j = i; j < end; j++) {
                sum += nums[j];
                if (sum == k) {
                    subarray_count++;
                }
            }
        }
        return subarray_count;
    }


    /* Solution 2 Using HashMap
     * Time Complexity: O(N)
     * Space Compelxity : O(N) extra hashmap
     * leetcode: Yes
     */
    public int subarraySum1 (int[] nums, int k) {
        int subarray_count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //check if the difference between the sum and k exists that means some subaary had a total sum of k thats why (sum -k = sum of some subarry which is same as sum - sum of some arry = k)

            //16-14 =2...so here we are checking if 16-2 and 14 exists, if does we know a subarray whose sum is 2 is present in between
            if (map.containsKey(sum-k)) {
                subarray_count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return subarray_count;
    }
}
