// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        //initialize with sum and max 0
        int sum = 0;
        int max = 0;
        
        //initialize the hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //traverse through the array
        //if we encounter 0, add 1 to sum. Else, subtract 1 from sum
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                sum += 1;
            }
            else{
                sum -= 1;
            }
            
            //if sum = 0 at any point, it means it is the longest subarray till that point so update the max and move forward
            if(sum == 0){
                max = i + 1;
            }
            
            //check if sum is present in hashmap. If not, put it in map.
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            //else update the max 
            else{
                max = Math.max(max, i - map.get(sum));
            }
        }
        return max;
    }
}