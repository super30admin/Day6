iclass Solution {
    
    // Time Complexity : O(N) where n is the size of input array
    // Space Complexity : O(N) - hashmap store n entries
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : Nope

    public int subarraySum(int[] nums, int k) {
        //check base case
        if (nums == null || nums.length == 0) return -1;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        //corner case when we see k for the first time eg. [1,1] - k = 2
        map.put(0,1);
        for(int num : nums) {
            //do prefix sum
            sum+=num;
            //check sum of nums[i:j] is in hashmap or not 
            if(map.containsKey(sum - k))
                count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
