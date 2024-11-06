import java.util.HashMap;
// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// (https://leetcode.com/problems/contiguous-array/)
public class problem2 {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map=  new HashMap<>();
        int rSum=0;
        int length=0;
        map.put(0,-1);
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==0)

            {
                rSum--;
            }
            else {
                rSum++;

            }
            if (map.containsKey(rSum))
            {
                length= Math.max(length, i-map.get(rSum));
            }
            else {
                map.put(rSum,i);
            }
        }
        return length;
    }
}
