/*
  Time Complexity : O(n))
  Space Complexity : O(n)

 Did this code successfully run on Leetcode : YES
 Any problem you faced while coding this :No 

Approach:Here we are using the running sum and hashmp 
 */
class
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length<=0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int max = 0;
        int sum =0;
        for(int i =0 ;i< nums.length;i++){
            if(nums[i] == 0){
                sum--;
            }if(nums[i] == 1){
                sum++;
            }
            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
