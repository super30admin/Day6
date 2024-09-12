// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/* APPROACH:
1. using pattern of contiguous sum, we will not only check the current sum equalling to k but also sum-k to check if sum-k had already occured.
2. to maintain encountered sums and their frequencies, we maintain a hashmap.
3. to cover edge cases, we first put sum 0 with frequency 1.
*/

import java.util.HashMap;

public class SubArraySumk {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0, count = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            } map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums1 = {1,1,1};
        System.out.println(subarraySum(nums1, 2)); //2

        int[] nums2 = {1,2,3};
        System.out.println(subarraySum(nums2, 3)); //2

    }
}
