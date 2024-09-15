// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach

import java.util.HashMap;
public class ContigousArray {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int rsum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rsum--;
            } else {
                rsum++;
            }

            if (hm.containsKey(rsum)) {
                max = Math.max(max, i - hm.get(rsum));

            } else {
                hm.put(rsum, i);
            }
        }
        return max;
    }

    public static void main(String args[]) {
        ContigousArray obj = new ContigousArray();
        int nums[]={1,0,1};
        System.out.println(obj.findMaxLength(nums));
    }
}