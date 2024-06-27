import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
We use running sum technique to find the count. Start by inserting a dummy input. Next, iterate over the length of array
to find the running sum up to that point. If the running sum is encountered for the first time, insert the key as this
sum and value as the count 1 and for every other occurrence of this running sum, increase the counter by 1. The logic
is that if same running sum occurs again and if this particular sum is a valid difference between another running sum
and the target k, that means between these two same occurrences, there is one other sub-array that fulfills criteria.
And if the valid difference is found, increment the counter value by the value of the rsum key.
 */

public class SubArraySumEqualsK {
    public static int subArraySum(int[] nums, int k) {
        if(nums.length == 1) {
            if(nums[0] == k) return 1;
            else return 0;
        }
        int count = 0;
        int rsum = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1); //dummy input to catch the first two elements sum correctly
        for (int num : nums) { //O(n) T.C
            rsum += num; //finding running sum
            if (hmap.containsKey(rsum - k)) count += hmap.get(rsum - k);
            if (!hmap.containsKey(rsum)) hmap.put(rsum, 0);
            hmap.put(rsum, hmap.get(rsum) + 1); //O(n) S.C
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,4,-1,2,7,0,-3,6,1,5,1};
        int k1 = 7;
        System.out.println("Number of continuous sub-arrays in nums1 " +
                "with sum equal to " + k1 + " are " + subArraySum(nums1, k1));
        int[] nums2 = {1,2,3,-1};
        int k2 = 2;
        System.out.println("Number of continuous sub-arrays in nums2 " +
                "with sum equal to " + k2 + " are " + subArraySum(nums2, k2));
    }
}
