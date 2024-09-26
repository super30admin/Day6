// Time Complexity :O(n) n is size of the array
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

//Making all the 0's as -1's.
//Creating a hashmap to store the sum till then and the index.
//Checking if the sum is already present if it is present meaning the elemnts between these two are having a sum of '0' which means they have equal number of 0's and 1's. So finding max length of subarray which has it.
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        h.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)
                    sum = sum - 1;
            else
                sum = sum + 1;
            if(h.containsKey(sum)){
                    maxLength = Math.max(maxLength,i - h.get(sum));
            }
            else
                h.put(sum,i);
        }
        return maxLength;
    }
}
