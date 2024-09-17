// Time Complexity : O(n), where n is the length of the input array (Iterate over the input array once to find the runningSum)
// Space Complexity :O(n), were n is the length of input array (space required to store runningSum occurences is hashMap)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : To find the difference between the approach used for contiguous array problem 
                                            // and this problem


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        //Return 0, if length of input array
        if(nums.length == 0) return 0;
        
        //HashMap to store the total occurence of each runningSum
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int runningSum = 0;
        int count =0;
        
        //to handle edge case of finding the first matching subarray, we add 0 at imaginary index -1
        //But since we are finding the length of the subarrays, but only the occureneces
        //we will add in the hashmap the occurence of this 0, which is 1
        hMap.put(0, 1);
        
        //iterate over each index of input array
        for(int i=0; i<nums.length; i++){
            //calculate the runningSum at each index
            runningSum += nums[i];
            //calculate the complement by substracting "k" from the runningSum
            int complement = runningSum -k;
            //check if this complement exists in the hashMap
            if(hMap.containsKey(complement)){
                //If yes, there is subarray from the index of complement+1 till the
                //index of runningSum, that sums to "k"
                //Add the number of occurenece of the complement found in the hashMap to out count
                count += hMap.get(complement);
            }
            
            //At every iteration, update the runningSum in the hashMap
            //Check if the runningSum alerady exists in the hashMap
            if(hMap.containsKey(runningSum)){
            //If yes, just increment the value of the runningSum to record one more occurenece
                hMap.put(runningSum, hMap.get(runningSum) +1);
            }
            else{
                //If doesnot exists, add the runningSum with its first occurenece in the hashMap
                 hMap.put(runningSum, 1);
            }
        }
        //After the iteration is done, return the count
        return count;
    }
}