import java.util.*;
// Time Complexity : O(N)
// Space Complexity : O(N)
// n being max size of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Was new to Running sum technique

class ContiguousArray {
    
    /*
        Approach :
        arr:  [0, 1, 1, 1, 0, 1, 1, 1]
        sum:  [-1,0, 1, 2, 1, 2, 3, 4]
    */
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int max = 0;
        map.put(0,-1); // edge case [0,1] or [1,0]
    

        for(int i = 0; i < nums.length; i++){            
            if(nums[i] == 0){
                sum -= 1;
            }else{
                sum += 1;
            }        
            
            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
       
        
        return max;
    }
}
