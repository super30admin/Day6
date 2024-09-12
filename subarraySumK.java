import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : yes, understanding the concept


// Your code here along with comments explaining your approach
/*Approach
The HashMap will store with the key being any particular sum, and the value being the number of times it has happened till the current iteration of the loop as we traverse the array from left to right.
For example:
k = 26.
    If a sub-array sums up to k, then the sum at the end of this sub-array will be sumEnd = sumStart + k. That implies: sumStart = sumEnd - k.
    Suppose, at index 10, sum = 50, and the next 6 numbers are 8,-5,-3,10,15,1.
    At index 13, sum will be 50 again (the numbers from indexes 11 to 13 add up to 0).
    Then at index 16, sum = 76.
    Now, when we reach index 16, sum - k = 76 - 26 = 50. So, if this is the end index of a sub-array(s) which sums up to k, then before this, just before the start of the sub-array, the sum should be 50.
    As we found sum = 50 at two places before reaching index 16, we indeed have two sub-arrays which sum up to k (26): from indexes 14 to 16 and from indexes 11 to 16.


*/

class subarraySumK {
    public static int subarraySum(int[] nums, int k) {
        
      int count = 0, sum = 0;
    Map < Integer, Integer > countSumMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
       
        if(sum==k)
        count++;
        if (countSumMap.containsKey(sum - k))
            count += countSumMap.get(sum - k);
        countSumMap.put(sum, countSumMap.getOrDefault(sum, 0) + 1);
    }
        
     
        return count;
       
        
        
    }

    public static void main(String [] args)
    {
        int inputArr[]= new int[]{3,4,7,2,-3,1,4,2};
        int k=7;

        System.out.println("subarray Count "+subarraySum(inputArr,k));
          

    }

}