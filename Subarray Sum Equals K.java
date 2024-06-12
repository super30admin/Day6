/*
Time Complexity: O(n)
Space Complexity : O(1)
*/
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0||nums==null){
            return 0;
        }
        //using the running sum strategy
        int runsum=0,count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //initially, initialize the map with runsum as 0 with its frequency as 1
        map.put(runsum,1);
        //iterate through the input array
        for(int i=0;i<nums.length;i++){
            //calculate the running sum and the difference of runsum and k to identify whether we have reached the k so far and detemined the subarray
            runsum = runsum + nums[i];
            int diff = runsum - k;
            //if the map contains the diff then a subarray is identified so inc count
            if(map.containsKey(diff)){
                count = count + map.get(diff);
            }
            //and if the map contains this runsum increse its frequency otherwise just add it to map
            if(map.containsKey(runsum)){
                map.put(runsum,map.get(runsum)+1);
            }
            else{
                map.put(runsum,1);
            }
        }
        return count;
    }
}