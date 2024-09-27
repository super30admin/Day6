// Time Complexity : O(n) (n- size of array)
// Space Complexity : O(n) (n- size of array)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : n/a

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0,rSum=0;
        map.put(0,1); // this is for the egde case where the initial elements will be taken into account
        for(int i=0; i<nums.length; i++)
        {
            rSum+=nums[i];
            if(map.containsKey(rSum-k))
                count+=map.get(rSum-k); //increment count value with the number of times rSum-k has occured previously
            if(map.containsKey(rSum))
                map.put(rSum,map.get(rSum)+1); //increment previous value of rSum in map
            else
                map.put(rSum,1); //add new value for rSum in map
        }
        return count;
    }
}