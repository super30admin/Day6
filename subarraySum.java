// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
/*Approach - here we have maintained the running sum and frequency of the running sum in the hashmap.
At every index i, check if the value of (rsum-k)[ i.e., rsum is the running sum at index i and k is the target
sum] is present in hashmap ; if so increment count value with the value present in hmap for that key(rsum-k)
and also increment the value of rsum by 1 in hmap, else put (rsum,1) in hmap.
*/


class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int rsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
            if(hm.containsKey(rsum-k))
            {
                count=count+hm.get(rsum-k);
           }
                hm.put(rsum,hm.getOrDefault(rsum,0)+1);
        }
        return count;
    }
}