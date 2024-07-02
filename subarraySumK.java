/*Approach: 
index:   0  1  2  3  4  5  6  7  8  9
example:[3, 4, 7, 2,-3, 1, 4, 2, 0, 1]    count=0+1= 1+1 = 2+1 = 3+1 = 4+1 = 5+2 = 7 -> answer
         3  7 14 16 13 14 18  20 20 21
k=7
rsum=21  
(comp=rsum-target)  -> 21-7 = 14
map{rsum:count}     -> map{0:1,3:1,7:1,14:2,16:1,13:1,18:1,20:2,21:1 }

TC: O(N) N is the number of int in the nums array.
SC: O(N) we store the rsum for each in the hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
*/
class Solution
{
    public int subarraySum(int[] nums, int k)
    {
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int rsum=0;
        int count=0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++)
        {
            rsum+=nums[i];
            int comp = rsum-k;
            
            if(map.containsKey(comp))
            {
                count+=map.get(comp);
            }
            if(!map.containsKey(rsum))
            {
                map.put(rsum,1);
            }
            else
            {
                map.put(rsum,map.get(rsum)+1);
            }
        }
        return count;
    }
}