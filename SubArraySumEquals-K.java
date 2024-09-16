// Time Complexity : O(n) n = no.of elements in array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No




class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length<1){
            return -1;
        }
            int count =0;
            int tempSum = 0;
            
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0,1);
            for(int i=0; i<nums.length; i++){
                tempSum = tempSum+nums[i];
               int compliment = tempSum-k;
                if(map.containsKey(compliment)){
                    count = count+ map.get(compliment);
                }
                if(!map.containsKey(tempSum)){
                    map.put(tempSum,1);
                }
                else{
                    map.put(tempSum, map.get(tempSum)+1);
                }
            }
        
        return count;
    }
}