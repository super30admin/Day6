// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/* 
 * 1. We will be using the running sum pattern to find the contiguous array of maximum length.
 * 2. At each and every index we check if the rsum has appeared previously.
 *    If it had occurred previously, it indicates that there is a contiguous sub array between previous index and the current index.
 * 3. If the above scenario happens then, we take the length of the new contiguous sub array and compare it with max.
 * 4. If the rsum hasn't occurred, then we update the rsum and its index in the map.
 * 
*/

import java.util.*;

class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Initializing the map with (0, -1).
        // This is to include the case for considering the sub array starting at index 0.
        map.put(0, -1);
        int max = 0, count  = 0;
        for(int i = 0; i < nums.length; i++){
            // If we hit a 0 number in the array then we decrement our count. Else, we increment our count.
            count = (nums[i] == 0)?count-1:count+1;
            
            // If we have encountered this count previously, 
            // that means we have a contiguous array between the previously found index and the current index.
            if(map.containsKey(count)){
                max = Math.max(max, i - map.get(count));
            }else{
                // If this is a new count, then we update the count and the index in the map for later.
                map.put(count, i);
            }
        }
        
        // Once we have iterated over the entire array return the max value.
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0,1}));
        System.out.println(findMaxLength(new int[]{0,1,0}));
        System.out.println(findMaxLength(new int[]{0,1,0,1,1,0,0,1,0}));
    }
}
