/**
 * Time complexity: O(N) where N is length of input array
 * Space complexity: O(N) where N is length of input array
 */
import java.util.*;
public class SubArraySumEqualsK {
    public static void main(String args[]) {
        int nums[] = {3,7,4,1,0,-1,4,3};
        int k = 7;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int rSum = 0;
        
        for(int i=0; i<nums.length; i++){
            rSum += nums[i];
            if(map.containsKey(rSum - k)){
                count += map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}
