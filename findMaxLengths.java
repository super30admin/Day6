import java.util.HashMap;
import java.util.Map;

// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes could think of brute force, but optimal was after referring to solution


// Your code here along with comments explaining your approach
/*Approach

Have we seen the count value before ? 
    1) if Yes, then fetch the value from the datastructure and update the value and also its index at which it was found
    2) If not, then just store in hashMap and the index at which it was stored.
    eg [0,0,0,0,0,1]
index:  0,1,2,3,4,5
run_sum -1,-2,-3,-4,-5,-4

thus at 1 (last element) we have already seen -4 sum at index 3 thus current index -lastindex 5-3=2 (length of subarray)[0,1]

1) think of a running sum where we encounter 0's and 1's. We keep track of the sum until the point as a key, value pair and thus can use a hashmap
2) we create a hashmap and store the current sum as key and value as its index. This will help us track the running sum at every possible index
3) to get the length of max subarray, we can think of getting the value from hashmap and subtracting from index.



*/
class findMaxLengths {
    public int findMaxLength(int[] nums) {
        
      if(nums==null || nums.length==0)
          return 0;
        
      Map<Integer,Integer> map = new HashMap<>();
      int runSum=0;
      int maxLen =0;
        
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++)
        {
            runSum = nums[i]==0 ? runSum-1 : runSum+1;
            
            if(!map.containsKey(runSum))
            {
                map.put(runSum,i);
            }
            else
            {
                int index = map.get(runSum);
                maxLen =Math.max(maxLen,i-index);
            }
            
        }
        return maxLen;
    }
}


