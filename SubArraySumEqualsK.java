// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was not able to get the Algo intuition 
// at first glance of problem


// Your code here along with comments explaining your approach
import java.util.HashMap;

class SubArraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int currSum = 0;
        int result = 0;

        HashMap<Integer, Integer> subArraySums = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];

            if(currSum == k)
                result++;

            if(subArraySums.containsKey(currSum - k)){
                result = result + subArraySums.get(currSum - k);
            }
            

            if(subArraySums.get(currSum) == null){
                subArraySums.put(currSum, 1);
            }
            else {
                subArraySums.put(currSum, subArraySums.get(currSum)+1);
            }

        }
        return result;   
    }
    public static void main(String[] args){
        System.out.println("SubArraySumEqualsK");
        int[] nums = {1,1,1};
        int k = 2;
        SubArraySumEqualsK obj = new SubArraySumEqualsK();
        System.out.println(obj.subarraySum(nums, k));

    }
}