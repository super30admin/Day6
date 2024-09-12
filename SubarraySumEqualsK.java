/*The logic is that using running sum, we can keep recording the running sum and the number of times it
has occured. If the current running sum-target is equal to a running sum seen before, the number of 
times it has been seen for the particualr length of array would be the number of subarrays that
would give us the target sum
Time complexity: O(N)
Space complexity: O(N)
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        int numOfSubArrays = 0;
        int rsum = 0;
        int output = 0;
        HashMap<Integer, Integer> indexAndSum = new HashMap<>();
        indexAndSum.put(0,1); //start with this as this would mean that the sum before 0th index was 0
        //and was seen once. This would make sure that the 1st element is included as well.
        for(int i=0;i<=nums.length-1;i++)
        {
            rsum=rsum+nums[i];
            if(indexAndSum.containsKey(rsum-k))
                output=output+indexAndSum.get(rsum-k);
            indexAndSum.put(rsum,indexAndSum.getOrDefault(rsum,0)+1);
        }
        return output;
    }
}