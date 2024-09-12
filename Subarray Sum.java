// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        
       
        HashMap<Integer,Integer> map = new HashMap<>();  // create a hashmap to store running sum along with its count
        
        map.put(0,1); // store 0 and its count 1 to not miss the initial subarray
        int rSum = 0;
        int count= 0;

        for(int i = 0; i < nums.length; i++){
            rSum = rSum + nums[i];  // calculate the rSum for every element of the array
            
            // if hash map contains the difference of running sum and k, 
            // then increase the count by the number of times difference of running sum and k has occurred
            if(map.containsKey(rSum - k)){      
                count += map.get(rSum - k);
            }

            // map.put(rSum, map.getOrDefault(rSum,0) + 1);
            if(map.containsKey(rSum)){
                // if hashmap already has the running sum as key, increment its count by 1
                map.put(rSum, map.get(rSum) + 1);
            } else {
                // if hashmap does not have the running sum as key, insert it with count 1
                map.put(rSum, 1);
            }

        }
         return count;
    }
}