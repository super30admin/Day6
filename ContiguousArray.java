import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
Key concept is that, if we calculate the running sum for the values in the array and at any later point in the array if
we encounter the same running sum that means the sub-array between these two same running sums is contiguous and we
return the maximum value of such occurrences. Rest is explained through in-line comments.
 */

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        //optimizations
        if(nums.length == 1) return 0;
        if(nums.length == 2) {
            if(nums[0] != nums[1]) return 2;
            else return 0;
        }

        int res = 0;
        int rsum = 0;
        HashMap<Integer, Integer> hmap =
                new HashMap<>(); //keys are runningSum at that particular index and values are indices
        hmap.put(0, -1); //taking dummy index -1 and the sum at this point is 0 for edge cases
        for(int i=0; i<nums.length; i++) { //O(n) T.C
            if(nums[i] == 0) rsum--; //treating zeros as -1 for the running purpose
            else rsum++; //treating ones as +1
            if(hmap.containsKey(rsum)) { //if the runningSum is already encountered
                //new result is max of previous res and difference between current index and the earlier
                // encountered index for same runningSum which is stored in the hashmap
                res = Math.max(res, i - hmap.get(rsum));
            } else { //if the runningSum is not encountered yet
                //add the rsum and the index it appeared to the map
                hmap.put(rsum, i); //O(n) S.C
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,1,0,1};
        int[] nums2 = {0,1,0,0,0,1,1,1,1,1,0,0,1,0,0};
        System.out.println("Longest contiguous array for nums1 is " + findMaxLength(nums1));
        System.out.println("Longest contiguous array for nums2 is " + findMaxLength(nums2));
    }
}
