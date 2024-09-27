// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : the exact value to be found in contains key


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        
       HashMap<Integer, Integer> map = new HashMap();
        int count = 0;
        int sum = 0;
        
        map.put(0,1); //This is for the unique value when there are negative terms in the array and the sum can become 0
        
        for(int i =0 ; i<nums.length ; i++)
        {
            sum+= nums[i];
        
        if(map.containsKey(sum-k))
        {
            count+= map.get(sum-k);
        }
            map.put(sum, map.getOrDefault(sum,0)+1);
            
            
        }
        
        return count;
    }
}
