// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/* 
 * We will be using the running sum pattern to find no of subarrays that add up to k.
 * If we found running sum - k in the key of hashmap , that means we found the subarray that add up to k
 * 

*/

class Subarraysum {
    
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
}