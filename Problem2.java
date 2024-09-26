// Time Complexity : O(n) because we are iterating through the array once
// Space Complexity : O(n) to store HashMap key value pair
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        int rSum = 0; 
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); //create HashMap of rSum(key) and its index(value)
        map.put(0,-1); //initialize hashmap to catch initial sub array
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i] == 0) // find Increase rSum by 1 on each occurance of '1' and decrease by 1 on each occurance of '0' in array 
            {
                rSum--;
            }
            else
            {
                rSum++;
            }
          if (!map.containsKey(rSum)) // if rSum(key) does not exist in our HashMap then put this key value pair in our HashMap
          {
              map.put(rSum, i);
          }
            else // if rSum already exist then find out the max vlaue by comparing previous max value at any other (rSum, index) pair and difference between indexes of current rSum 
            {
                max = Math.max(max, (i - map.get(rSum)));
            }
        }
        return max;
    }
}
