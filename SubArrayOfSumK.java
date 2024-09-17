/*
 Time Complexity - O(n)
 Space Complexity - O(n) worst case when all the running sums are different
 Has it passed all testcases on leetcode? - yes
 */
/*
 Based on running sum, if sum[i] - sum[j] = k, the sum of elements between indices i and j is k which is the required subarray.
 We use a hashmap to store running sum and its occurences.We traverse over array and keep calculating running sum.
 We determine if sum-k already exists in hashmap and if yes increment the count while adding the sum to the hashmap. If a sum 
 occurs multiple times, keep incrementing its count. After traversing the entire array, count gives the number of subarrays of sum K
 */
public class SubArrayOfSumK {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> sumToCountMap = new HashMap<>();
        int totalSubArrs = 0;
        int rSum = 0;
        sumToCountMap.put(0,1);
        
        for(int i=0; i <nums.length;i++){
            rSum += nums[i];
            if(sumToCountMap.containsKey(rSum - k)){
                totalSubArrs += sumToCountMap.get(rSum - k);
            }
            sumToCountMap.put(rSum, sumToCountMap.getOrDefault(rSum,0)+1);
        }
        return totalSubArrs;
    }
}
