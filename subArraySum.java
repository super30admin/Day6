// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

//approach: created a hashamp to store the runing sum and its frequency.we will then check the complimentary sum is existing
// in the hashmap or not. if it is present, we increase the count.
// Your code here along with comments explaining your approach


import java.util.HashMap;

public class subArraySum {
    class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(map.containsKey(sum-k))
            {
                int freq=map.get(sum-k);
                count=count+freq;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
}
