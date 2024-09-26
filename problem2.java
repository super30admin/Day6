import java.util.*;

public class problem2 {

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int rsum=0;
        int len=0;
        
        for(int i=0;i<nums.length;i++){
            //Some Cases
            hm.put(0,-1);
            
            if(nums[i]==0){
                rsum--;
            }else{
                rsum++;
            }
            
            if(!hm.containsKey(rsum)){
                hm.put(rsum,i);
            }else{
                len = Math.max(len,i-hm.get(rsum));
            }
        }
        return len;
        
    }
}
