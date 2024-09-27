import java.util.*;
public class problem1 {
    // using brute force
    public static void continuousSum(int[] nums, int expectedSum) {
        int count = 0, sum=0;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
            for(int j=i+1;j<nums.length;j++) {
                sum = sum + nums[j];
                if(sum == expectedSum) {
                    count = count + 1;
                    sum = 0;
                    break;
                }
            }
            sum = 0;
        }
        System.out.println("output using brute force is "+count);
    }
    // o(n) solution
    //referred leetcode
    public static void continuousSum1(int[] nums, int expectedSum) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - expectedSum)) {
                result += preSum.get(sum - expectedSum);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
            System.out.println("output without using brute force is "+result);
    }
    
    



    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int expectedSum = 2;
        // System.out.println(group(arr));
        // System.out.println("problem");
        continuousSum(nums, expectedSum);
        continuousSum1(nums, expectedSum);
    }
}

// Time Complexity : 0(n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : o(n) solution approach was challenging to understand.