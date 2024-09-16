//time complexity : O(n) n=length of nums
//space complexity ; O(n)
//I don't face any problems
//runs successfully on leetcode

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK560LeetCode {


    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();                        //creating hashmap
        map.put(0,1);                                                       //put 0 as key and 1 as value

        int sum=0;
        int count = 0;

        for(int i=0; i<nums.length;i++){

            sum+= nums[i];                                              //calculate cumulative sum of array
            if(map.containsKey(sum-k)){                                 //check if sum-k present in map
                count+=map.get(sum-k);                                  //if yes then increase the count
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);       //if not present then add sum as key
        }
        return count;
    }
}
