// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int currsum=0;
        map.put(0,-1);
        int maxm=0;
        for(int i=0;i<nums.length;i++)
        {   //if nums[i] is 1,+1 else -1
            currsum=currsum+(nums[i]==1?1:-1);
            //if mapcontains currsum, check if the difference between the indexes is larger than maxm, if yes update the same
            if(map.containsKey(currsum))
            {
                maxm=Math.max(maxm,i-map.get(currsum));
            }
            //else simply put it in the hashmap
            else{
                map.put(currsum,i);
            }
        }
        //return maxm
        return maxm;
        
    }
}
