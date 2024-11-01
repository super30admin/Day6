// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

//approach: created a hashmap to store the running sum. for calculating the running sum, if 1 is there increase sum by 1, 0
// is there decrease it by 1. add the running sum to the hashmap. if the running sum is already there in the map, calculate 
// the length. then compare it with the length to find the max length.
// Your code here along with comments explaining your approach



import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int length=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)  sum++;
            else
                sum--;
            if(map.containsKey(sum))
                length=Math.max(length,i-map.get(sum));
            else
                map.put(sum,i);
            
        }
        return length;
    }
}
