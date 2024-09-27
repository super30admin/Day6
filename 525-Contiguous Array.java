//Time Complexity=O(N)
//Space Complexity=O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int zero=0,max=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) zero++;
            else zero--;
            //We are checking if the sum exists in the map, if it does then we are setting max to the maximum of previous max or length of subarray as the map contains the previous location of the sum and 
            if(!map.containsKey(zero))
                map.put(zero,i);
            else
               max= Math.max(max,i-map.get(zero));
        }
        return max;
    }
}