import java.util.*;

//Time Complexity : o(n) - total no of elements
//Space Complexity : o(n)
//Did this code successfully run on Leetcode : yes
public class ContiguousSubArray {
	
	public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        //for the first  occurrence of zero
        map.put(0,-1);
        int rSum=0;
        int max = 0;
        
        for(int i=0;i<nums.length;i++){
        	//zero add -1 and one add +1
            rSum = nums[i] == 0? rSum-1 : rSum+1;
            //if rSum happens before then between those two indices we have same no of 1s and 0s
            if(map.containsKey(rSum)){
            	//store max of previous and  length
                max = Math.max(max,i-map.get(rSum));
            } else{
                 map.put(rSum,i);
            }
           
        }
        return max;
    }

}
