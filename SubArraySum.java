// Time Complexity : O(N) where N is size of the array provided.
// Space Complexity : O(N) where N is auxiallary space we are using.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : couldn't develop the intiution of how to use hashing. Will solve more problems like this for practice.

import java.util.*;

public class SubArraySum {

    public int subarraySum(int[] nums, int k) {
        int subArrays = 0;
        int compliment = 0;
        int sum = 0;
        
        //map to store each intermediate sums and their indices.
        Map<Integer, Integer> interSubArrays = new HashMap<>();

        //add 0 sum as the start as the starting sum is 0
        //if we later find sum as 0, means the sum of all the numbers since beginning of the array is k
        interSubArrays.put(0, 1);

        for(int i = 0; i < nums.length ; i++) {
            sum += nums[i];
            
            //calculate compliment, this tells us what total is needed apart from current number to get k
            //total of this number to all other numbers with this compliment/sum will be k
            compliment = sum - k;
            
            if(interSubArrays.containsKey(compliment)) {
                //add number of other indices that had total sum as this current number's compliment
                subArrays += interSubArrays.get(compliment);
            }
            
            //add current sum to the hashMap
            if(!interSubArrays.containsKey(sum)) {
                interSubArrays.put(sum, 1);
            } else {
                interSubArrays.put(sum, interSubArrays.get(sum) + 1);
            }
        }
        
        //return total possible subarrays count
        return subArrays;
    }
}