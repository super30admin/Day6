// Time Complexity : O(N)
// Space Complexity : O(N) in worst case
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,-1);
        int rSum = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                rSum++;
            }
            else {
                rSum--;
            }
          if(hm.containsKey(rSum)){
              max = Math.max(max, i - hm.get(rSum));
          }
          else{
                hm.put(rSum,i);
         }
        }
        return max;
    }
}