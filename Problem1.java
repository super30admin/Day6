// Time Complexity : O(n) 
// Space Complexity : O(n) worst case we have to store every number
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I was stuck initally becasue I didnt add the base case (0,1) to map


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int result = 0;
        
        map.put(0, 1); // when the subarray is found for 1st time
        
        for(int num: nums){
            sum += num;
            if(map.containsKey(sum-k)) //if sum-k exsist then array with sum k exsists too
                result += map.get(sum-k);
            
            map.put(sum, map.getOrDefault(sum, 0)+1); // storing sum at each step
        }
       
        return result;
    }
}