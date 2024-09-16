//time complexity: O(n)
//space complexity: O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0; //counter to count the sub-arrays
        int sum=0; //to keep the sum of running sum 
        
        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
            
            // if the same sum is already present in your map, then we increase the count of sub-array
            if(map.containsKey(sum- k))
                count = count + map.get(sum-k);
                
            //if key isn't present we put the sum and the count initially as 0
            if(!map.containsKey(sum)){
                map.put(sum, 0);
            }
            map.put(sum, map.get(sum) + 1);
            
        }
        
      return count; 
    }
}