    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/subarray-sum-equals-k/
    Time Complexity for operators : o(n)
    Extra Space Complexity for operators : o(n) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

        # Basic approach : Two for loop. traverse to the each element and inner array will do the sum of elements 
                            if that sum is equal to 'k' then we found the subarray, increment the counter by 1. 
                            s
        # Optimized approach: The main idea behnid this is do the sum and check with 'k'. 
                              
            # 1. Declare hashmap and add first element as 0 with index 1.
            # 2. Iterate through the for loop, do the sum and get the complement  by substracting k from it.
            # 3. if complement is found in sub arrau the increase the count by adding the hashmap value of it.
            # 4. if sum is not found then add it in hashmap with '1'. else put the same sum with the increment in previous 
                 sum.
    */
    
import java.util.*;
public class subarray_sum_equalsK_560 {
    public static void main(String args[]) {
        int arr[] = new int[] {1,-1,1,3,-3,2,1};
        int val = subarray_summ_equalsk(arr,3);
        System.out.println(val);
    }

    public static int subarray_summ_equalsk(int nums[],int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        hm.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            
            int comp = sum - k;
            
            if(hm.containsKey(comp)){
                count += hm.get(comp);
            }
            
            if(!hm.containsKey(sum))
                hm.put(sum,1);
            else{
                hm.put(sum,hm.get(sum)+1);        
            }
        }
        return count;
    }
}
