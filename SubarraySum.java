// Time Complexity : The time complexity is O(n) where n is the length of the array since we are iterating through the array only once.
// Space Complexity : The space complexity is O(n) since in a hashmap we are storing the sum and there could be n possible number of sums for an array of length n.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {

        int output = 0;
        int sum = 0;

        // Hashmap which stores the sum and its count
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0;i<nums.length;i++){

            // cummulative sum
            sum += nums[i];

            // If map contains (sum-k) add its value to output
            if(map.containsKey(sum-k)){
                output += map.get(sum-k);
            }
            // Add cummulative sum as key and count as value
            map.put(sum,map.getOrDefault(sum,0)+1);

        }

        return output;
    }
}

