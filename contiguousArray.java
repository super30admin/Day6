//TC: O(n) the array is traversed only once
//SC: O(n) worst case if all the elements are only 1s or only 0s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length<=1)
        {
            return 0;
        }
        int rsum=0;
        int max=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0; i< nums.length; i++)
        {
            if(nums[i]==0)
            {
                rsum-=1;
            }
            else
            {
                rsum+=1;
            }
            
            if(!map.containsKey(rsum))
            {
                map.put(rsum,i);
            }
            else
            {
                max = Math.max(max,i-map.get(rsum));
            }
        }
        return max;
    }
}