//time - O(n)
//space - O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> support = new HashMap<Integer, Integer>(); // sum maps to index
        support.put(0, -1); // initially sum is 0 at start i.e till index -1
        
        int sum = 0; //incremented by 1 when 1 is seen in nums else decremented by 1
        int result = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                sum--;
            }
            else
            {
                sum++;
            }
            if(support.containsKey(sum))
            {
                // this means that the subarray from the index when sum appeared earlier to the current
                //index is a valid subarray
                // update result with this subarray size 
                result = Math.max(result, i - support.get(sum));
            }
            else
            {
                support.put(sum, i); // add current sum, current index
            }
        }
        
        return result;
    }
}
