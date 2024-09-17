import java.util.HashMap;
// Time Complexity : O(n) - n: length of array
// Space Complexity : O(n) - map may contain n distint sum values
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Initially I tried to create a new array with just sum values, 
//but it is not required. We can just keep a variable sum.

public class Problem2 {
    
    public static int contiguousArray(int[] nums){

        int sum=0,len=0; 
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            sum = sum + (nums[i]>0 ? 1: -1);
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }

        return len;
    }

    public static void main(String[] args){
        int[] nums = {0,1,0};
        System.out.println(contiguousArray(nums));
    }

}