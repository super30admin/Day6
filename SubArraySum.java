/*
  Time Complexity : O(n))
  Space Complexity : O(n)

 Did this code successfully run on Leetcode : YES
 Any problem you faced while coding this :No 

Approach:Running sum  is hint for this problem and maintain existing sum in hashmap with cont 
how many times that we encountered 
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i=0 ; i<nums.length; i++){
            sum = sum+nums[i];
            if(map.containsKey(sum - k)){
                 count = count + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);  
    }
        return count;
}
}
