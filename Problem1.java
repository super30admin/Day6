// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Understanding what to store in the hashmap for running sum.


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
         if(nums == null || nums.length == 0){
             return 0;
         }
        
        int rSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            int currNum = nums[i];
            rSum += currNum;
            if(map.containsKey(rSum-k)){
                total += map.get(rSum-k);
            }
            if(map.containsKey(rSum)){
                int currSum = map.get(rSum);
                map.put(rSum,++currSum);
            }else{
                map.put(rSum,1);
            }
               
        }
        return total;
    }
}