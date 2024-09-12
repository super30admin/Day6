// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
//calculate running sum, +1 for 1, -1 for 0, store index for first time we see curSum
//logic is if we encounter curSum again later, this sequence has equal number of 0's and 1's
//calculate i-map.get(curSum), update max

class Solution {
    public int findMaxLength(int[] nums) {
        //base case
        if(nums==null || nums.length==0)
            return 0;
        
        //initialize max, curSum, hashmap
        int max=0, curSum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        
        //calculate running sum, +1 for 1, -1 for 0, if havent seen curSum before, put else continue
        //if seen curSum before, in hashmap, calculate i-map.get(curSum)
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1)
                curSum += 1;
            else
                curSum -= 1;
            
            if(!map.containsKey(curSum))
                map.put(curSum, i);
            else
                max = Math.max(max, i-map.get(curSum));
        }

        return max;        
    }
}