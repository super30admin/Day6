//Time complexity=O(N)
//Space complexity=O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 

class Solution {
    public int subarraySum(int[] nums, int k) {
        //We are iterating the entire array and storing the sum in the hashmap and if the sum is repeated then we are incrementing its count. If a value (sum - k) exists in the string then add it to count variable and repeat this till the loop ends
        HashMap<Integer,Integer> map=new HashMap<>();
        int total=0,count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
            if(map.containsKey(total-k))
                count+=map.get(total-k);
            if(!map.containsKey(total))
                map.put(total,1);
            else
            {
                int curr=map.get(total);
                curr++;
                map.put(total,curr);
                
            }
            
        }
        return count;
    }
}