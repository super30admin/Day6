Time Complexity: O(n)
Space Complexity : O(n)
Runs on LeetCode : Yes


class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0; int zeros=0;
        
        for(int i =0 ; i<nums.length;i++)
        {
            if(nums[i]==1) zeros++;     // Increment the count of Zeros if we                                                 encounter 1 in the array.
            else
                zeros--;        // Decrement the count of zeros if element =0.
            
            if(zeros==0) max=i+1;
            
            if(map.containsKey(zeros))
                max=Math.max(max,i-map.get(zeros));
            
            else
                map.put(zeros,i);
        }
        return max;
        
    }
}