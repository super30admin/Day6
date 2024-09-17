/** Time Complexity : O(n) whole array is traversed once
 * //Space Complexity : O(n) hashmap may contain n distinct values of cumulative sums
 * //executed on leetcode: yes
 * //issues while coding: failing for test case nums=[1] and k=0 in case I check if(map.containsKey(diff)) in the end of for loop instead of beginning.
 * // approach : 
 * 
 * 1. we iterate through the array once while calculating the cumulative sum.
 * 2. If the cumulative sum minus k value is present in the hashmap it means that at some point in the past we  had a cumulative sum of sum-k and that means we found a subarray.
 * 3. if the map contains cumulative sum as key , it means that we found a new instance of cumulative sum, so we increment the value in the hashmap.
 * 4. else, we create a new entry of cumulative sum as key with value 1
 */
import java.util.*;
class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1); //in case the consecutive sum is itself equal to k; like [1,1] and k=2, [1,1] still counts as a subarray
        int result = 0;
        int cumulative_sum = 0;
        for(int i=0;i<nums.length;++i)
        {
            cumulative_sum = cumulative_sum + nums[i];
            int diff = cumulative_sum-k;
            if(map.containsKey(diff))
            {
                result = result + map.get(diff);
            }
            if(map.containsKey(cumulative_sum))
            {
                map.put(cumulative_sum,map.get(cumulative_sum)+1);
            }
            else
            {
                map.put(cumulative_sum,1);
            }   
        }
        return result;
         
    }
    public static void main(String[] args) {
        SubArraySum obj = new SubArraySum();
        int[] nums = new int[]{1,1,1};
        int k=2;
        System.out.println("number of subarrays="+obj.subarraySum(nums, k));
        
    }
}