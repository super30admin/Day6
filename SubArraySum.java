/*
 * Time Complexity: O(n) 
 * Space complexity: O(n) 
 * Ran successfully on LeetCode: Yes 
 */
import java.util.HashMap;

public class SubArraySum {

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(subarraySum(nums, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int rSum = 0;
        int result = 0;
        
        for(int i = 0;i < nums.length;i++)
        {
            rSum += nums[i];
            
            if(map.containsKey(rSum - k))
            {
                result += map.get(rSum - k);
            }
            
            if(map.containsKey(rSum))
            {
                map.put(rSum, map.get(rSum) + 1);
            }else
            {
                map.put(rSum,1);
            }
        }
        return result;
    }
    
}
