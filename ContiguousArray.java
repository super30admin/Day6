import java.util.HashMap;

/*******
## Problem2 (https://leetcode.com/problems/contiguous-array/)

Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (525. Contiguous Array)
Any problem you faced while coding this :       No
*******/

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int count = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);
        
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count--;
            }
            if(map.containsKey(count)){
                maxLen = Math.max(maxLen, i - map.get(count));
            }
            else
                map.put(count, i);
        }
        
        return maxLen;
    }

    public static void main(String args[]) 
    { 
        ContiguousArray obj = new ContiguousArray();
        int[] nums = {0 ,1};
        System.out.println(obj.findMaxLength(nums));
    }
}
