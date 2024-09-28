// Time Complexity : O(n) where n is the length of input array
// Space Complexity : O(n) for the HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Brute Force approach exceeded time limit, could implement hashmap with little help

//taking a variable count which increments by 1 for 0 and decrements by 1 for 1
//when the count becomes 0, we got equal number of 0s and 1s
//or when we come across the same count again, that means equal subarray is in between the indices with the same count value
//keep track of the max subarray length and return it

class Solution {
    public int findMaxLength(int[] nums) {
        int MaxLen=0, count=0;
        HashMap<Integer,Integer> res=new HashMap<>();
        res.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0) count++;
            else count--;
            
            if(res.containsKey(count)){
                MaxLen=Math.max(MaxLen,i-res.get(count));
            }
            else{
                res.put(count,i);
            }
            
            }
            
        
        return MaxLen;
    }
}