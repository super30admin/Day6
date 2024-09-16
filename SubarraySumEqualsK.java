// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        //Created a hashMap to store rSum and it's count
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int count = 0;
        
        //edge case for -1th index
        map.put(0,1);
        
        //iterating in given array
        for(int i = 0; i<= nums.length - 1; i++){
            
            //calculating rSum
            rSum = rSum + nums[i];
            
            //to check if hashmap already contains rSum - k yes then increment the count of rSum in the map 
            if(map.containsKey(rSum - k)){
                count += map.get(rSum - k);
            } 
            
            //else put rSum in the map and store the the count
                 map.put(rSum, map.getOrDefault(rSum,0) + 1);
            
            
        }
        
        return count;
    }
}