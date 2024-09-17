// Time Complexity : O(N) where N is size of the array provided.
// Space Complexity : O(N) where N is auxiallary space we are using.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : couldn't develop the intiution of how to use hashing. Will solve more problems like this for practice.

import java.util.*;

public class ContigousArray {
    public int findMaxLength(int[] nums) {
        //map to store each intermediate sums and their indices.
        Map<Integer, Integer> sumIndices = new HashMap<>();
        int total = 0, max = 0;
        
        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] == 1) {
                total -= 1;
            } else if(nums[i] == 0) {
                total += 1;
            }
            
            //if total is 0, means all the numbers since the beginning of the array are contigous and
            // have equal number of 1s and 0s
            if(total == 0) {
                max = i + 1;
            } else {
                //else search for the first occurence of this sum
                if(sumIndices.containsKey(total)) {
                    //first occurrence found, check if the distance from current index is greater than max
                    int diffIndices = i - sumIndices.get(total);
                    if(diffIndices > max) {
                        max = diffIndices;
                    }
                } else {
                    //first occurrence of this total not found, add it
                    sumIndices.put(total, i);
                }
            }
        }
        
        //return the max length
        return max;
    }
}