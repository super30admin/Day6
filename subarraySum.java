// Time Complexity : O(n)  n is the length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0, diff = 0, rsum = 0;
        for (int i=0; i<nums.length; i++){
            rsum += nums[i];
            diff = rsum - k;
            if(map.containsKey(diff)){
                count += map.get(diff);
                }
            if(map.containsKey(rsum)){
               map.put(rsum, map.get(rsum) + 1); 
            }
            if(!map.containsKey(rsum)){
                map.put(rsum, 1);
            }
        }
        return count;
        
    }
}