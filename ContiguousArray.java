// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class ContiguousArray {
    public int findMaxLength(int[] nums) {
        
        int maxLen = 0;
        if(nums.length==1)
            return 0;
        
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1) nums[i] = ++count;
            else nums[i] = --count;
        }
        
        Map<Integer,Integer> sumMap = new HashMap<>();
        sumMap.put(0,-1);
        
        for(int i=0;i<nums.length;i++) {
            if(sumMap.containsKey(nums[i])){
                maxLen = Math.max(maxLen , i-sumMap.get(nums[i]));
            }else{
                sumMap.put(nums[i],i);
            }
        }
        
        return maxLen;
    }
}
