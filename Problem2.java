/* Problem 2: Longest contiguous subarray
*/

// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Contiguous subarray is equal number of 0 and 1
//here we need to find the longest contiguous subarray
//Approach 1: Brute Force: explore each subarray likes nested ones like [0,1],[0,1,0]...
//the above approach gives O(n^2)
//Approach 2: HashMap: we can optimize this approach by O(n) since iterating over whole array is O(n) and search will be O(1) which is fast
//Note: Linked List can also be used but HashMap is faster since we are maintaining key, value as runningSum and corresponding index
//What is runningSum technique? runningSum helps find the maximum difference between current index and previous index where the rSum has occured before. This will reduce the nested operations. This max difference(of indexes) will give balanced subarray(0, 1) like equal 0s and 1s
//Why we are using runningSum? to eliminate nested operations
//runningSum will be calculated by:
//1. if we encountered 1, then running sum is +1
//2. else if we encountered 0, then running sum is -1
//here we will create hashmap maintaining (runningSum, corresponding index)
//1. if runningSum has occured before, change the max with difference of curr - prev index(where runningSum has occured)
//2. else, add the runningSum with corresponding index
//Edge case: initialise or put (0,-1) in map before
//O(t) = O(n) and O(s) = O(n)
//Note: if you have been asked to return longest contiguous subarray itself
//then include condition
/* if(map.containsKey(rSum)){
    if(i - map.get(rSum) > max){
        max = i - map.get(rSum);
        start = map.get(rSum);
        end = i;        
    }
} */  

//Approach 2: HashMap
class Solution {
    public int findMaxLength(int[] nums) {
        //initialising HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        //initialise max to keeping max difference for length of contiguous subarray
        int max = 0;
        //initialise runningSum
        int rSum = 0;
        //edge case: add runningSum as 0 at index -1
        map.put(0, -1);
        //iterating over the nums array
        for(int i = 0; i < nums.length; i++){
            //check if we have encountered 0, then decrement rSum value by 1
            if(nums[i] == 0){
                rSum = rSum - 1;
            } else {
                //increment by 1
                rSum = rSum + 1;
            }
            //if runningSum has occured in map, then find the max difference
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;
    }
}