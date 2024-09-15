// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


class Solution {
    public int subarraySum(int[] nums, int k) {
        //initialize sum and count(no of subarrays) with 0
        int sum = 0;
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //consider the empty subarray case to start with
        map.put(0,1);
        
        //traverse through the array and keep updating sum
        for(int i = 0; i < nums.length; i++){
            
            sum += nums[i];
            
            //calculate the complement and check if it is present in hashmap then update the value of count
            int comp = sum - k;
            if(map.containsKey(comp)){
                count += map.get(comp);
            }
            
            //if hashmap does not contain key, we just put the sum and 1 to begin with in the map
            if(!map.containsKey(sum)){
                map.put(sum, 1);
            } 
            //if already present, update the value of that key
            else{
                map.put(sum, map.get(sum) + 1);
            }
        }
        return count;
    }
}