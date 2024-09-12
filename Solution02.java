import java.util.*;

public class Solution02 {

    public int findMaxLength(int[] nums) {
       int result =0;
        int rn=0;
        Map <Integer, Integer> rc = new HashMap<>();
        rc.put(0,-1);
        for(int i =0; i<nums.length;i++){
            if(nums[i]==0) {
                rn--;
            }
            else{
                rn++;
            }
            if(!rc.containsKey(rn)){
                rc.put(rn,i);
            }
            else{
                int oldIndex=rc.get(rn);
                result=Math.max(result,i-oldIndex);
            }
        }
        return result;
        
    }
}
