import java.util.HashMap;

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
public class Solution1 {
    public int findMaxLength(int[] nums) {
    
        if(nums==null||nums.length==0)
            return 0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        map.put(0,-1);
        //manintain an array to store rsum
        int [] rsum= new int[nums.length];
        if(nums[0]==0)
            rsum[0]=-1;
        if(nums[0]==1)
            rsum[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==1)
                rsum[i]=rsum[i-1]+1;
            else
                rsum[i]=rsum[i-1]-1;
        }
        for(int i=0;i<rsum.length;i++){
            //if rsum i encountered for the first time
            if(!map.containsKey(rsum[i]))
                map.put(rsum[i],i);
            else
            { //if rsum appear again , it means there are same number of 0'1 and 1's between them.
                int curr=i-map.get(rsum[i]);
                max=Math.max(curr,max);
            }
        }
        return max;
    }
}
