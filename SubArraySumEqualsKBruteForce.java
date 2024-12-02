/**
 * Time complexity is O(n^2)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
public class SubArraySumEqualsKBruteForce {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {1}, 1));
        System.out.println(subarraySum(new int[] {1,1,1}, 2));
        System.out.println(subarraySum(new int[] {3,  4,  7,  2,  -3,  1,  4,  2,  0,  1}, 7));
    }

    private static int subarraySum(int[] nums, int k) {
        //base condition
        if(nums == null || nums.length == 0){
            return 0;
        }

        //if array is of length 1 and if it has the required sum
        //Arrays of length 1 doesn't enter the for loops because of the loop conditions
        if(nums.length == 1 && nums[0] == k){
            return 1;
        }

        int count = 0;

        for(int i=0; i<nums.length-1; i++){
            int sum = nums[i];
            if(sum == k){ // check if that element itself contributes to the sum - subarray of size 1
                count++;
            }
            for(int j=i+1; j<nums.length; j++){
                sum = sum + nums[j];
                if(sum == k){
                    count++;
                }
                // check if the last element itself contributes to the sum - subarray of size 1
                if(i == nums.length-2 && j == nums.length - 1){
                    if(nums[j] == k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
