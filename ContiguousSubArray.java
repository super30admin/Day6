// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.HashMap;

public class ContiguousSubArray {
	public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int currSum=0;
        int max=Integer.MIN_VALUE;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                currSum+=-1;
            }else{
                currSum+=1;
            }
            
            if(!map.containsKey(currSum)){
                map.put(currSum,i);
            }else{
                max=Math.max(max,i-map.get(currSum));
            }  
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
