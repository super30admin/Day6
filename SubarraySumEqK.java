/*
Time complexity: O(n^2) two for loop touching every element twice
Space : O(1)

Problem: Found it hard to implement in O(n) time
*/
public class SubarraySumEqK {
    public static int subarraySum(int[] nums, int k) {
        int totalSubArrays = 0;
        for(int i = 0 ; i < nums.length; i++){
            int currSum = 0;
            for(int j = i; j< nums.length; j++){
                currSum += nums[j];
                if(currSum == k) totalSubArrays++;
            }
        }
     return totalSubArrays;   
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,4,3,1};
        System.out.println(subarraySum(arr, 3));
    }
}