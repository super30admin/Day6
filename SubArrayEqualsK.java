// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

import java.util.HashMap;

public class SubArrayEqualsK {
    public static int subarraySum(int[] nums, int k) {

        int count = 0;
        int cumulativeSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for(int i=0; i< nums.length; i++) {
            int currElement = nums[i];
            cumulativeSum = cumulativeSum + currElement;

            // calculate the difference b/n cumulative sum and target k
            int currDifference = cumulativeSum - k;

            // If the difference is present in the map, add the value to the count. this means 
            if(map.containsKey(currDifference)) {
                 count = count + map.get(currDifference);
            }
            if(!map.containsKey(cumulativeSum)) {
                map.put(cumulativeSum, 1);
                    
            } else {
                map.put(cumulativeSum, map.get(cumulativeSum) + 1) ;
            }

        }

        return count;

    }     

    public static void main(String args[]) {
        System.out.println(subarraySum(new int[]{1,2,3,4,5,6,7,8}, 7));
    }
}