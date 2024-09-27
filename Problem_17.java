// Time Complexity :O(n) n is number of integers in the array
// Space Complexity :O(n) n is maximum number of rsum's possible
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//I used running sum technique 

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
       int count=0, rsum=0;
        for(int i=0;i<nums.length;i++){
            rsum =rsum+nums[i];
            if(map.containsKey(rsum-k)){
                count=count+map.get(rsum-k);
            }
            if(map.containsKey(rsum)) map.put(rsum,map.get(rsum)+1);
            else{
                map.put(rsum,1);
            }
        }return count;
    }
}