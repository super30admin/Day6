//Time Complexity : O(N)
//Space Complexity : O(N)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int subarraySum(int[] nums, int k) {
        //if the nums array is not given
        if(nums==null||nums.length==0)
            return 0;         
        //initalizing a hashmap with return type of int
        //key=rsum, value=no of times of the rsum
        HashMap<Integer, Integer> hMap=new HashMap<>();
        //intialize rsum and total(no of subarrays)
        int rsum=0, total=0;
        hMap.put(0,1);//0[1,2]
        //iterate over every element in the array
        for(int i=0;i<nums.length;i++){
            //add that element to the rsum
            rsum=rsum+nums[i];
            //checking if the hash map contains rsum-k
            if(hMap.containsKey(rsum-k))
                //add it to total
                total=total+hMap.get(rsum-k);
            //put the rsum and its occurence into the map, if it already exists add +1, if it is 1st time it will take value 0 and add +1
            hMap.put(rsum, hMap.getOrDefault(rsum,0)+1);             
        }
        return total;
    }
}