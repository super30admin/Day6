/*
 Time Complexity - O(n) where n is length of array
 Space Complexity - O(n) worst case where runningSum is unique for every element eg:[1,1,1,1,1,1]
 Has it passed all test cases on leetcode? - Yes
 */
/*
  This problem uses running sum to calculate longest contiguous subarray with equal no of 0's and 1's.
  running sum is calculated at every index and stored in a hashmap with the sum and the lowest index where we encountered it.
  running sum is calculated by adding 1 for every 1 in the array and by subtracting 1 for every o in the array.
  If a running sum is repeated in the array, the subarray between where the value has repeated and where the value has first occurred
  gives a contiguous subarray with equal number of 1's and 0's. we keep a max counter and when the contiguous subarray is even bigger
  than previous max- we keep resetting max.
 */
public class ContiguousSubArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer,Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0,-1);
        int rSum = 0;
        int maxSubArray = 0;
        
        for(int i =0; i <nums.length; i++){
            if(nums[i] == 1){
                rSum++;
            }
            else{
                rSum--;
            }
            
            if(sumIndexMap.containsKey(rSum)){
                maxSubArray = Math.max(maxSubArray, i - sumIndexMap.get(rSum));
            }
            else{
                sumIndexMap.put(rSum,i);
            }
        }
        return maxSubArray;
    }
}
