    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/contiguous-array/
    Time Complexity for operators : o(n)
    Extra Space Complexity for operators : o(n) .. 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Two for loop. traverse to the each element and inner array will increment count for both '0' and '1'
                            if they are equal then we found the subarray, the store the max length by comparing with max;
        # Optimized approach: The main idea behnid this is increase when there is '0' and decrement when there is '1'. 
                              
            # 1. If we found similar sum in the hashmap that means we found the subarray. 
            # 2. Also make sure that is '0' is found then change the max to (i+1) directly.
            # 3. if sum is not dound then store it in hashmap with its index
            # 4. At the end, return max. That's the required o/p
    */
    
import java.util.*;
public class contiguous_array_525 {
    public static void main(String args[]) {
        int arr[] = new int[] {1,0,1,1,1,1,0,0,1,0,1};
        int val = cont_array(arr);
        System.out.println(val);
    }

    public static int cont_array(int nums[]) {
        int max = 0;
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum += 1;
            }else{
                sum -= 1;
            }
            
            if(sum == 0)
                max = i+1;
            
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }else{
                max = Math.max(max, i - hm.get(sum));
            }
        }
        return max;
    }
}
