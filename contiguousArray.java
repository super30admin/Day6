// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

cclass Solution {
    public int findMaxLength(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        map.put(0,-1);

        for(int i = 0 ; i<nums.length ; i++)
        {
            if(nums[i] == 1)
            {
                sum+=1;
            }
            else
            {
                sum-=1;
            }

            if(!map.containsKey(sum))
            {
               map.put(sum,i);
            }
            else
            {
                   maxLen = Math.max(i-map.get(sum), maxLen);
            }

        }
        return maxLen;
    }
}
