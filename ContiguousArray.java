/**
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length==0) return 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,-1);
        int runningSum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)
                runningSum--;
            else runningSum++;
            if(hmap.containsKey(runningSum)){
                int current = i - hmap.get(runningSum);
                max = Math.max(current,max);
            }
            else{
                hmap.put(runningSum,i);
            }
        }
        return max;
    }
    public static void main(String args[]){
        ContiguousArray obj = new ContiguousArray();
        int[] myArray = new int[]{0,1,0,0,1};
        System.out.println("Longest Contiguous Array is of size: "+obj.findMaxLength(myArray));
    }
    
}