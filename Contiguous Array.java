/*
Time Complexity : O(n)
Space Complexity : O(1)
*/
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length==0||nums==null){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0,runsum=0;
        //using the runsum strategy
        //initialize the hash map with key as 0 with value -1 to get appropriate boundaries
        map.put(0,-1);
        //iterate through the array
        for(int i=0;i<nums.length;i++){
            //update the runsum, if 0 is found subtract by 1 or if 1 is found add 1
            runsum = nums[i]==0 ? runsum-1 : runsum+1;
            //if the map contains runsum, then determine the subaaray length and check if its max 
            if(map.containsKey(runsum)){
                max = Math.max(max,i-map.get(runsum));
            }
            //otherwise add it to hashmap
            else{
                map.put(runsum,i);
            }
        }
        return max;
    }
}