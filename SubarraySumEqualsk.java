//Time Complexity: O(n) . It is a one pass solution
//Space Complexity: O(n)
// leetcode #560
// Technique used: running sum
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        if(nums.length==1)
            return nums[0]==k? 1: 0;
        
        HashMap<Integer,Integer> rsum2Count=new HashMap<>();
        int res=0,rsum=0;
        
        rsum2Count.put(rsum,1); // initially put count 1 for rsum=0;
        for(int i=0;i<nums.length;i++)
        {
            // calculating running sum
            rsum+=nums[i];
            
            // if the compliment of rsum exists in hashmap => we found a new contiguous subarray with sum =k. 
            //Hence increment res by number of times compliment ahs occured previously 
            if(rsum2Count.containsKey(rsum-k))
            {
                res+=rsum2Count.get(rsum-k);
            }
            
            //put rsum =1 if rsum doesn't exist. Else increment existing rsum count by 1
            rsum2Count.put(rsum, rsum2Count.getOrDefault(rsum,0)+1);
        }
        
        return res;
    }
}