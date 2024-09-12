// Time Complexity : O(n) -- n is the length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int longest = 0, rsum = 0, temp = 0;
        if(nums.length == 1){return 0;}
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 0){
                rsum += -1;
            }
            if (nums[i] == 1){
                rsum += 1;
            }
            if(map.containsKey(rsum)){
              temp = i - map.get(rsum);
                  if(temp>longest){
                      longest = temp;
                  }
            }
            else{
                map.put(rsum, i);
            }
        }
        return longest;
    }
}
