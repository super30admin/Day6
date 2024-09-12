public class SubArraySumK {
  /**
   * Problem: https://leetcode.com/problems/subarray-sum-equals-k/
   * 
   * 
   * Notes: 
   * Using the running sum approach
    
   * If I maintain a running sum between two indices, I dont need to find the sum of elements of
   * nested array between those indices. Since the difference in running sum between those 2 indexes just gives 
   * me the sum of elements in between.
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)

   * Did this code successfully run on Leetcode : Yes
   * Any problem you faced while coding this : No 
   * 
   */


  public int subarraySum(int[] nums, int k) { 
        Map<Integer, Integer> map = new HashMap<>(); // Map from running_sum to the number of times the sum has occured so far.
        
        int running_sum = 0;
        int result = 0;
        map.put(0, 1); // Sum 0 can be saved as if it occured once.
        for(int i = 0; i < nums.length; i++) {
            running_sum += nums[i];
            
            if(map.containsKey(running_sum - k)){
                result += map.get(running_sum - k);
            }
            
            map.put(running_sum, map.getOrDefault(running_sum, 0)+1);
        }
        
        return result;
  }

}
