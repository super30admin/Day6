// Time Complexity : O(N) goes through array linearly
// Space Complexity :O(N) for Hashmap created. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Subarraysum {
    public int subarraySum(int[] nums, int k) {
     
        int count = 0, sum = 0;
        HashMap < Integer, Integer > hmap = new HashMap < > (); // stores cumulative sum up to all indices and number of times same sum occurs
        hmap.put(0, 1); // start with sum=0 and since it occured once value is 1.
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];   // calculate sum upto taht index
            if (hmap.containsKey(sum - k)){ // check if sum-k is present 
                count += hmap.get(sum - k); // increment count as one more occurence has occured
            }
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1); // else put sum and its value is number of occurences +1
        }
        return count; // return final count
    }
}