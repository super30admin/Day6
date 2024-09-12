// Time Complexity :O(n) n is the size of array;
// Space Complexity : O(n) as the size of the array would increase so would the size of the hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int compliment;
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            compliment = sum - k;
            if(map.containsKey(compliment))
            {
                count += map.get(compliment);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,0);
            }
            
            map.put(sum,map.get(sum) + 1);
            
        }
        
        return count;
    }
}