import java.util.HashMap;

// Time Complexity : O(N) where N is the number of array elements
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
Use Running sum pattern. Work on the intution that if difference between 2 sub arrays==k then increase count.
* */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        hm.put(0,1);
        for(int num:nums){
            sum+=num;
            if(hm.containsKey(sum-k)) count+=hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
