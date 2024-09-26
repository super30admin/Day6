// Time Complexity : O(n^2)
// Space Complexity : O(1) constant space is used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach : Brute Force Approach


public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum=0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1) constant space is used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

Using HashMap Approach : we can look at it with an example [3,4,7]

give an initial <key, value> pair (0,1) now let's find the cumulative sum and store the key,value pair at every step. let's say k = 7

now 1st iteration is (3,1) and (sum - k) = -4 and it's not in our map so we will continue next iteration it will be (7,1) and sum - k =0
and we had (0,1) in our map hence we got our first subArray.

public class Solution {
    public int subarraySum(int[] nums, int k) {
      int count = 0;
        int sum = 0;
         Map <Integer , Integer> map = new HashMap<>();
        map.put(0,1); 
        
        for (int i = 0; i < nums.length; i++)
        {       sum +=nums[i];
        if(map.containsKey(sum-k))
            count +=map.get(sum - k);
        
        Integer result = map.get(sum); 
            if (result == null) 
                map.put(sum, 1); 
            else
                map.put(sum, result+1); 
    }
            return count;
    }
}
