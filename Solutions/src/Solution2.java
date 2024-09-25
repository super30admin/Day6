// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int rsum=0;
        int length = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                rsum=rsum-1;
            }
            else{
                rsum = rsum+1;
            }
            if(map.containsKey(rsum)){
                int tmp = i-map.get(rsum);
                length=Math.max(length,tmp);
            }
            else{
                map.put(rsum,i);
            }
        }
        return length;
    }
}