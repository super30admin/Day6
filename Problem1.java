import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
It is based on the fact that
if sum at two different points in the array differ by the target,
then it can be inferred that the count of the elements in the middle is equal to the target
 */

public class Problem1 {

    public static void main(String[] args) {
//        int[] nums = {1,1,1};
//        int k = 2;

        int[] nums = {1,2,2, 0};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();

        //
//        map.put(0, 1);

        int rSum = 0;

        for (int i = 0; i < n; i++) {
            rSum += nums[i];

            if(map.containsKey(rSum - k)) {
                count += map.get(rSum - k);
            }

            if(!map.containsKey(rSum)) {
                map.put(rSum, 1);
            } else {
                map.put(rSum, map.get(rSum) + 1);
            }
        }

        return count;
    }
}
