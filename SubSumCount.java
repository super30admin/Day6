// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/* 
 * 1. We will be using the running sum pattern to find the contiguous array of maximum length.
 * 2. At each and every index we check if the (rsum - k)th value has appeared previously.
 *    If it had occurred previously, it indicates that there is a contiguous sub array between previous index and the current index whose sum is k.
 * 3. If the above scenario happens then, we take the value of the (rsum - k)th element from the map and add it to final count.
 * 4. We increment the (rsum - k)th value by 1, to keep the track of the new array that we identified.
 * 
*/


import java.util.*;

class SubSumCount {
    public static int subArraySum(int[] nums, int k) {
        
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int count = 0, rsum  = 0;
        for(int i = 0; i < nums.length; i++){
            rsum += nums[i];
            
            if(map.containsKey(rsum - k)){
                count += map.get(rsum - k);
            }
            map.put(rsum, map.getOrDefault(rsum, 0)+1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subArraySum(new int[]{1,1,1}, 2));
        System.out.println(subArraySum(new int[]{1,2,3}, 3));
    }
}
