// Time Complexity : O(N) goes through array linearly
// Space Complexity :O(N) for Hashmap created. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ContiguousArray {
    public int findMaxLength(int[] nums) {
         Map<Integer, Integer> hmap = new HashMap<>(); // stores index and count value
        hmap.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] !=1 ) // if 0 encountered, make num to -1 to count zeroes uniquely
                nums[i]=-1;
            count = count + nums[i]; // whenever 1 occurs you add it to count
            if (hmap.containsKey(count)) {  // check if count is present in map
                maxlen = Math.max(maxlen, i - hmap.get(count)); // store length of largest subarray in maxlen with equal zeroes and 1's based on index
            } else {
                hmap.put(count, i); // else put hmap with key as count and value as index
            }
        }
        return maxlen; // return maxlen
    }
}