//time - O(n)
//space - O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        //map of subarray sum to number of times that sum occurs
        HashMap<Integer, Integer> support = new HashMap<Integer, Integer>();
        //initially sum is 0 and it occured once
        support.put(0,1);
        int sum = 0;
        int result = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            //a subarray is valid i.e sums upto k if current_sum - k is alreadyy seen
            //so update the result accordingly
            sum += nums[i];
            if(support.containsKey(sum - k))
            {
                //then this subaaray is valid
                result += support.get(sum - k);
            }
            //at every element we either update or put in the hashmap
            support.put(sum, support.getOrDefault(sum , 0) + 1);
        
        }
        return result;
     }
}
