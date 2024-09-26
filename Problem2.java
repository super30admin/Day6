// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Took some time to understand the concept of running sum and the index
// Your code here along with comments explaining your approach


import java.util.HashMap;

public class Problem2 {

    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        //putting a dummy value of 0 and index -1
        map.put(0,-1);

        int rSum = 0;
        int max = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] == 0){
                rSum--;
            }
            else{
                rSum++;
            }

            if(map.containsKey(rSum)){
                max = Math.max(max, i-map.get(rSum));

            }
            else{
                map.put(rSum,i);
            }

        }
        return max;
    }
}
