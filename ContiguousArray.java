/*
    1. Time Complexity : O(n)
    2. Space Complexity : O(n)   
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */

/*
 * To check if the array is balanced i.e equal no of 0's & 1's, calculated sum at each index.
 * if nums[i] == 0 then sum is decremented else sum is incremented.
 * Once sum is calculated at an index, check if sum is already present in HashMap
 * if yes, then calculate the length of subarray from current index and the first occurance index of sum. Check if this length is greater than prev length.
 * if no, then this the first time we encountered that sum , add {sum : index}  to the hashmap
 */
import java.util.HashMap;
class Solution {
    public static int findMaxLength(int[] nums) {
        int length = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        for (int i = 0;i < nums.length; ++i) {
            if (nums[i] == 0) sum-=1;
            else sum+=1;
            if (map.containsKey(sum)) {
                length = Math.max(length, i - map.get(sum));
            } else
                map.put(sum, i);
        }
        return length;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,1,0,0,1,0,1,1,0,0,0,1};
        System.out.println("Maximum length of a contiguous subarray is: " + findMaxLength(nums));
    }
}