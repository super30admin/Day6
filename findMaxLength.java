import java.util.HashMap;

import javax.print.attribute.standard.Copies;

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
public class findMaxLength {
    public int findMaxLength(int[] nums){
        if(nums==null || nums.length==0)return 0;
        int max=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=count-1;
            }
            else{
                count =count+1;
            }
            if(map.containsKey(count)){
                max=Math.max(max,i-map.get(count));
            }else{
                map.put(count, i);
            }
        }
        return max;
    }
}
