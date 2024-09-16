// Time Complexity : O(N) where N is the length of the nums array
// Space Complexity : O(N) where N is the length of the map which can be at max the length of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I missed the i+1 at both the places and had to debug to understand that I needed i+1 instead of i at both the places

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
      //start with an additional 0 aat index -1
        map.put(-1, 0);
        int sum = -1;
        int maxLength = 0;
        for(int i=0; i<nums.length; i++){
          // if 0 subtract 1 to the sum
          // if 1 add 1 to the sum
            if(nums[i] == 0)
                sum -= 1;
            else
                sum += 1;
            if(map.containsKey(sum)){
              // if sum already exists in the map
                int index = map.get(sum);
                maxLength = Math.max((i+1) - index, maxLength);
            }
            else
                map.put(sum, i+1);
        }
        return maxLength;
    }
}
