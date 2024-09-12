/**
 * Time complexity: O(N) where N is length of input array
 * Space complexity: O(N) where N is length of input array
 */
import java.util.*;
public class ContiguousArray {
    public static void main(String args[]) {
        int [] nums = {1,0,1,0,1,0,1};
        System.out.println(findMaxLength(nums));
    }
    public static int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0;
        int rSum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                rSum --;
            }else{
                rSum ++;
            }
            
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }else{
                map.put(rSum, i);
            }
        }
        return max;
    }
}
