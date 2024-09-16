// Time Complexity : O(n) where n is array size
// Space Complexity :O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ContiguousArray {
    public int findMaxLength(int[] nums) {

        int size = 0;
        int sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(sum,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) sum--; else sum++;		//1 -> increment, 0 -> decrement
            if(map.containsKey(sum))				//if sum already appeared in map (prevSum), there are equal number 	of zeros and ones between current sum and prevSum
            {
                size= Math.max(size,i-map.get(sum));//calculate current_index and prev index where sum was same
            }
            else
            {
                map.put(sum,i);						//add sum to map with its inde as value
            }
        }
        return size;
    }
}