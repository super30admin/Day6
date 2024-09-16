/* Problem 1: Subarray sum equals K
*/

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Subarray sum equals k
//Brute force: this would involve nested operations like forming subarray each time which will be O(n^2)
//Optimised approach: create runningSum and use Hashmap to store (rSum, number of times it has occured)
//this will reduce time to O(n) and space is O(n)
//runningSum is used here to eliminate nested operations and because subarray sum is involved(for product operations, try rProduct)
//Approach: in edge case, add (0,1) in map first.
//1. if runningSum - target(k) exist in hashmap,
//then count = count + map.get(runningSum - target)
//2. if runningSum exist in hashmap,
//then count = count + 1
//else add runningSum in hashmap

class Solution {
    public int subarraySum(int[] nums, int k) {
        //initialise HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        //edge case
        map.put(0,1);
        int rSum = 0;
        int count = 0;
        //iterate over nums array
        for(int i = 0; i < nums.length; i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)){
                count += map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}