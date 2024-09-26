//time complexity: O(n), n is length of array
//space complexity:O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public int subarraySum(int[] nums, int k) {
        int l = 0, r = nums.length;
        int count = 0;
        int cumSum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        for(int i=0; i<r; i++) {
            //get cumulative sum of items until index i
            cumSum = cumSum + nums[i];
            
            //if map contains (cumsum-k)
            //true -> we have encountered a subarray whose sum is K
            if(map.containsKey(cumSum - k)) {
                //increment count by value at cumSum-k
                count += map.get(cumSum - k);
            }
            
            //add prev occurance of cumulative sum + 1
            map.put(cumSum, map.getOrDefault(cumSum, 0) + 1);
            
        }
       
        return count;
    }

}