// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Took some time to understand the concept of running sum and the index


import java.util.HashMap;

// Your code here along with comments explaining your approach
public class Problem1 {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        //adding a dummy value and index
        map.put(0,1);

        int rSum =0;
        int result = 0;

        for(int i=0; i<nums.length; i++){

            //running sum
            rSum+=nums[i];

            if(map.containsKey(rSum-k)){
                result = result + map.get((rSum-k));
            }
            if(!map.containsKey(rSum)){
                map.put(rSum,0);
            }
            map.put(rSum,map.get(rSum)+1);
        }
        return result;
    }
}
