// Time Complexity :O(N) Iterating through array & creating hashmap as we iterate.So its a one pass
// Space Complexity : O(N) as we are using hashmap to store
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


//If you decide on using hashing and there is question related to finding 
//contigous subarray or finding sum of subarray ,running sum/cumulative sum is one of the technique

//Edge case is running sum 0 occured once

class Solution {
    public int subarraySum(int[] nums, int k) {
        //Hashing with running sum
        //Storing rsum and frequency in hashmap
        
        //Checking edge case
        if(nums == null || nums.length ==0)
            return 0;
        
        //Using Hashing with cumulative sum/running sum as key  and frequency of sum  as value
        Map<Integer, Integer> sumMap = new HashMap<>();
            
    //initilaize hashMap  as 0 occured once  ie. 0 1
        sumMap.put(0,1);
        
        int rSum = 0, count =0;
        
        for(int i = 0; i< nums.length; i++)
        {
            //Calculate the running sum
            rSum += nums[i];
            
            //Check if complement exists in map i.e runningSum-k
            
            //If complement(running sum- k) does not exist in map , add the running sum and the frequency to hashmap
            //If complement (running sum -k =0) is zero, update counter by 1,meaning we found a subarray whose sum match the target and update              //the running sum & frequency .Meaning irrespective whether we are updating counter, we have to update the map with runningsum & frequency
            //If complement (running Sum -k) exists in hashmap, update the counter by 1(We will update the count only when compliment exists) and update the hasmap with running sum
            //if running sum already exist in hashmap, we update the frequency 
            
            if(sumMap.containsKey(rSum-k))
            
                count += sumMap.get(rSum-k);
            
            //update Map with new sum/count
            
            sumMap.put(rSum, sumMap.getOrDefault(rSum, 0)+1);
        }

        
        return count;
        
    }
}