import java.util.HashMap;
import java.util.Map;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class MaxLengthArray {
    public int findMaxLength(int[] nums) {
        /*maintaining the RSum here*/
        //if we make all the 0's as -1 then problem becomes finding longest subarray with sum 0;
        int rSum=0,maxLength=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            rSum+=(nums[i]==0)?-1:1;
            if(!map.containsKey(rSum))
            {
                map.put(rSum,i);
            }
            else maxLength=Math.max(maxLength,i-map.get(rSum));
        }
      return maxLength;
    }
    public static void main(String[] args)
    {
        int[] nums={0,1,0};
       MaxLengthArray obj=new MaxLengthArray();
       System.out.println(obj.findMaxLength(nums));
    }
}