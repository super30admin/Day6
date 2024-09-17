// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : reaching the formula rsum-k, 


class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap(); //hm containing rsum and no of occurences
        int rsum= 0;int count=0;                         //   |--|
        hm.put(0,1);// to include for edge case, use example {3, 4, ---- rsum(i.e 7)-k(i.e 7)= 0, occurring at index 1}
        for(int i=0;i<nums.length;i++)                   // |-|
        {
            rsum+=nums[i];              //add recurring sum
            if(hm.containsKey(rsum-k)){ //if map has value of rsum-k, means the current subarray is of sum k, if more                                                   
                                        //ocurrances of rsum-k, means same ocuurence of subarray of sum k
            count+=hm.get(rsum-k);     // hence get the occurences and add to count
            }

            hm.put(rsum,hm.getOrDefault(rsum,0)+1);//add new rsum to map
        }
        return count;
    }
}