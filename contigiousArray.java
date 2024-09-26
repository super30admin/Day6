// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach

public class contigiousArray {
    
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        
        HashMap<Integer, Integer> sMap=new HashMap<Integer, Integer>();
        int sum=0; int max=0;
        sMap.put(0,-1);
        for(int i=0; i<nums.length;i++){
            
            if(nums[i]==0){
                sum-=1;
            }
            else
                sum+=1;
            
            if(sMap.containsKey(sum)){
                max=Math.max(max, i-sMap.get(sum));
            }
            else
                sMap.put(sum,i);
            
            
        }
        return max;
        
    }
}