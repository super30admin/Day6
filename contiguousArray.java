// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;
public class contiguousArray {
        public int findMaxLength(int[] nums) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int max = 0, count = 0;
            hm.put(0,-1);
            for(int i=0;i<nums.length;i++){
                if(nums[i]== 0){
                    count-=1;
                }
                else{
                    count += 1;
                }
                if(hm.containsKey(count)){
                    max = Math.max(max, i-hm.get(count));
                }
                else{
                    hm.put(count, i);
                }
            }
            return max;
        }
 }

