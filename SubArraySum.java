//Time complexity : O(n)
//Space complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public int subarraySum(int[] nums, int k) {
      //null case
      if(nums == null || nums.length == 0) {
        return 0;
      }
      
      HashMap<Integer,Integer> map = new HashMap<>();
      int rSum = 0; int count = 0;
      map.put(0,1);
      //calculate running sum
      for(int i = 0; i<nums.length;i++) {
        rSum += nums[i];
        //if rSum  exist
        if(map.containsKey(rSum - k)) {
          count += map.get(rSum - k);
        }
        //if rSum  does not exist
        if(!map.containsKey(rSum)) {
          map.put(rSum, 1);
        } else {
          map.put(rSum, map.get(rSum)+1);
        }
       
      }
       return count;
    }
}