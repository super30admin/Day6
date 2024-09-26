/*
 * Time Complexity: O(n) - length of the array
 * Space complexity: O(n) 
 * Ran successfully on LeetCode: Yes 
 */

import java.util.HashMap;

public class BalancedArrayrSum {

    public static void main(String[] args) {
        int arr[] = {0,1,0};
        System.out.println(findMaxLength(arr));
    }
    public static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();    
        int rSum =0;
        int max = 0;
        
        map.put(0,-1);
        
        for(int i= 0; i <= nums.length - 1; i++)
        {
            if(nums[i] == 0)
            {
                rSum--;
            }
            else
            {
                rSum++;
            }
            
            if(map.containsKey(rSum))
            {
                max = Math.max(max,i - map.get(rSum));
            }
            
            else
            {
                map.put(rSum,i);
            }
        }
        return max;
    }
    
}
