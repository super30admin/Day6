import java.util.HashMap;

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : Figuring out the way to remmeber the indices. 


// Your code here along with comments explaining your approach

class ContinuousArray {
    public static int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int output = 0;
        int count=0;
        for(int i = 0; i <nums.length;i++)
        {
            if(nums[i]==0)
               count--;
            else
               count++;
            if(map.containsKey(count))
               output = Math.max(output, i-map.get(count));
            else{
                map.put(count,i);
            }
        }
        return output;
    }
    public static void main(String args[])
    {
        System.out.println(findMaxLength(new int[]{0,1}));
    }
}