import java.util.HashMap;

// Time Complexity : O(N) where N is the number of array elements
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
Use Hashing- Store the COUNT (when 0 sub 1, when 1 add 1), Index mapping
if mapping absent add it, else update max length.
* */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums.length==0 || nums==null) return -1;
        //count and index
        int max=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        int count=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }else{
                count-=1;
            }
            if(!hm.containsKey(count)){
                hm.put(count,i);
            }else{
                max=Math.max(max,i-hm.get(count));
            }
        }

        return max;
    }
}
