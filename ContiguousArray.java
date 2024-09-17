// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach : We iterate through our whole array, when we find a 0, we increment by 1, else we decrement by 1
// Whenever we get the number of zeros as 0, then we know that the number of zeros & ones are same until that point.
//  So we assign the value of max to the current idx position+1. Then we will put the put the value of zero in map 
// if new value of zero is already there in the map else will update our max value to the max of current value of max or 
// the index where we at right now - the value of the (zero value) in the map.
import java.util.HashMap;
class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length==0) return 0;
        int max = 0, zero = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
            else zero--;
            if(zero==0) max = i+1;
            if(!map.containsKey(zero)) map.put(zero,i);
            else max = Math.max(max,i-map.get(zero));
        }
        return max;
    }
}