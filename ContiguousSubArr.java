//Time complexity : O(n)
//Space complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int findMaxLength(int[] nums) {
       //null check
      if(nums.length == 0 || nums == null) {
        return 0;
      }
      
      HashMap<Integer, Integer> map = new HashMap<>();
      //add dummy index 
      map.put(0,-1);
      int rSum = 0; int max = 0;
      for(int i=0;i<nums.length;i++) {
        if(nums[i] == 0) {
          rSum--;
        } else {
          rSum++;
        }
        
        if(map.containsKey(rSum)) {
          //there exist a balanced arr 
          int currentLength = i-map.get(rSum);
          if(currentLength > max) {
            max = currentLength;
          }
        } else {
          // add running sum in map
          map.put(rSum,i);
        }
      }
      return max;
    }
}