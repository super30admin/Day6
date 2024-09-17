// Time Complexity :O(n) n-length of the array
// Space Complexity :O(n) 
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this :-
class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,1);// default value (rSum,number of time rSum is repeated) --> (0,1)
        int rSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            rSum+=nums[i];
            int compliment=rSum-k;
            if(!map.containsKey(rSum))
            {
                map.put(rSum,0);   
            }
            if(map.containsKey(compliment))
            {
            count+=map.get(compliment);
            }
            map.put(rSum,map.get(rSum)+1);
           
         
            
        }
        return count;
    }
}