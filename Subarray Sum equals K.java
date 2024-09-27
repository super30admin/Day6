// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Update the array with the corresponding recurring sums. While iterating over the 
// array check if the value in array - k is present in HashMap if yes then 
// increment count by value corresponding to the Hash key. If the value in 
// array is present in the HashMap then increment its corresponding value by 1
// in HashMap, if not present then create a new entry in HashMap with value as 1. 

class Solution {
    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        h.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            nums[i] = sum; 
        }
        for(int j=0;j<nums.length;j++){
            if(h.containsKey(nums[j]-k)){
                count = count+h.get(nums[j]-k);
            }
            if(h.containsKey(nums[j])){
                h.put(nums[j],h.get(nums[j])+1);
            }
            else{
                h.put(nums[j],1);
            }
        }
        return count;
    }
}