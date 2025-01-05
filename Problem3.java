// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No
import java.util.HashMap;

//Look at the question it says : A subarray is a contiguous non-empty.
//Using brute force -> we've to get all the sub arrays and then go for the sum, so T.C is O(n2).
//So whenever the t.c reaches O(n2) some techniques should come into our mind such as Running sum.
class Problem3 {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        HashMap<Integer,Integer> hMap = new HashMap<>();//key -> runningSum and value -> frequency we've seen the key.
        hMap.put(0,1);
        int rSum = 0;
        int ans = 0;
        for(int i =0 ;i<nums.length;i++){
            //1) Find Running Sum.
            rSum = rSum+nums[i];
            //2) Find rsum-k and check if that has existed sometime before
            if(hMap.containsKey(rSum-k)){
                ans = ans + hMap.get(rSum-k);
            }
            hMap.put(rSum,hMap.getOrDefault(rSum,0)+1);
        }
        return ans;
    }
}