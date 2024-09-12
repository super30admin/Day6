//560. Subarray Sum Equals K
//Running sum solution
// Time complexity: O(n2), consider every subarray possible
//Space Complexity: O(1), constant space
// maintain the sequence else we get wrong answer, first you need to check if complement exists in the hashMap

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);
        int count = 0;
        int runningSum = 0;

        for(int i = 0; i<nums.length; i++){
            runningSum += nums[i];
            int complement = runningSum - k;

            if(hash.containsKey(complement))
                count = count + hash.get(complement);

            if(!hash.containsKey(runningSum))
                hash.put(runningSum, 1);
            else
                hash.put(runningSum, hash.get(runningSum) + 1);
        }
        return count;
    }
}