// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
--------------------------------------------------------------------Approach 1 ---------------------------------------------------------------------------------------
  class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        
        //Checking all subarrays including the number itself and verifying whether sum equals K;
        for(int start=0;start<nums.length;start++){
            int sum=0;
            for(int next=start;next<nums.length;next++){
                sum+=nums[next];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}

----------------------------------------------------------- Approach 2 --------------------------------------------------------------------------------------------------
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, it took sometime to understand how are we calculating currsum and compliment


// Your code here along with comments explaining your approach
  class Solution {
    public int subarraySum(int[] nums, int k) {
        //Inside nums, check compliment using for loop
        //If complement there in hashmap, then increment answer by count of compliment and also add currsum to  hashmap
        //Add currsum to hashmap if not there, otherwise increment currsum if already there.
        Map<Integer,Integer> hashMap = new HashMap<>();
        int currSum=0;
        int count=0;
        int compliment;
        
        hashMap.put(0,1);
        
        for(int i:nums){
            currSum+=i;
            compliment = currSum-k;
            if(hashMap.containsKey(compliment)){
                count+=hashMap.get(compliment);
            }
            
            hashMap.put(currSum, hashMap.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}
