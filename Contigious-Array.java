// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach.

// Approach: In this we are maintaining a rsum and a count variable. All the unique rsums we are inserting in an hashmap with value as their first instance index.
// Next time when the same rsum is encountered then we will look up in hashmap and then subtract both and update the max.
class Solution {
    public int findMaxLength(int[] nums) {
        //base condition
        if(nums==null || nums.length==0){
            return 0;
        }
        int max=0;
        int rSum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //We are inserting the 0 with index as -1 else when in future rsum is zero at that time when it will look up in hashmap it will not find it and we will get incorrect results.
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            // If the nums[i] is 0 then we are subtracting from rsum else if it is 1 then we are adding 1 in rsum
            if(nums[i]==0){
                rSum--;
            }
            else{
                rSum++;
            }
            if(!map.containsKey(rSum)){
                map.put(rSum,i);
            }
            max=Math.max(max,i-map.get(rSum));
        }
        //At the end we are returning max as it will be the maximum llength of an subarray
        return max;
    }
}