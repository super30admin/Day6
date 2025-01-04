import java.util.HashMap;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Maintain a hashmap of running sum and its frequency. Calculate the total num of arrays found of
// target sum k by counting the frequency of running sum minus target value

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length ==0){
            return 0;
        }
        int totalNum=0;
        int rsum =0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        for(int i=0;i<nums.length;i++){
            rsum+=nums[i];
            if(hmap.containsKey(rsum-k)){
                System.out.println(rsum-k);
                totalNum+= hmap.get(rsum-k);
            }

            hmap.put(rsum, hmap.getOrDefault(rsum,0)+1);
            System.out.println("rsum "+rsum+" "+hmap.get(rsum));
        }

        return totalNum;
    }
}
