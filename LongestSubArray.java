// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : coming up with the logic of applying cumulative sum and hashmap

import java.util.HashMap;

public class LongestSubArray {
    public int findMaxLength(int[] nums) {
        
        int maxLength = 0;
        int cumulativeSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        for(int i=0; i< nums.length; i++) {
            int currElement = nums[i];
            // if element is zero, add 1 else subtract 1 from cumulative sum
            if(currElement == 0) {
                cumulativeSum = cumulativeSum + 1;
            } else {
                cumulativeSum = cumulativeSum - 1;
            }
            
            // store the index of the cumulativeSum
            if(!map.containsKey(cumulativeSum)) {
                map.put(cumulativeSum, i);

                // get length by the formula (end index - start index)
            } else {
                int currLength = (i - (map.get(cumulativeSum)));
                if (currLength > maxLength) {
                    maxLength = currLength;
                }
            }

        }

        return maxLength;

    }
}