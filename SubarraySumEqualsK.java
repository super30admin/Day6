// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int runningsum=0;
        //put 0,1 initially
        map.put(0,1);
        int complement=0;
        //iterating through the list
        for(int i=0;i<nums.length;i++)
        {   
            runningsum+=nums[i];
            complement=runningsum-k;
            //if map contains the complement ,increment count to number of times it appears
            if(map.containsKey(complement))
            {
                count+=map.get(complement);
            }
            //if runningsum is already there in map,increment its no. to one
            if(map.containsKey(runningsum))
            {
                map.put(runningsum,map.get(runningsum)+1);
            }
            else
            {//else simply put it in map
                map.put(runningsum,1);    
            }
        }
        return count;
    }
}