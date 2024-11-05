// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach : we are keeping a running sum of the
// array using curr. And whenever a given curr occurs, then that means that index of curr, and the current
//index are balanced.



import java.util.*;
/**
 * ContiguousSubarray : ContiguousSubarray
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 04, 2024)
 * @since : 1.0 (Nov 04, 2024)
 */
public class ContiguousSubarray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int curr = 0, length = 0;
        map.put(0, -1);
        for(int i =0; i < nums.length; i++){
            if(nums[i] == 1){
                curr++;
            }else{
                curr--;
            }
            if(map.containsKey(curr)){
                length = Math.max(i-map.get(curr), length);
            }else{
                map.put(curr, i);
            }
        }
        return length;
    }

}
