//Time complexity - O(N)+(O(N)-worst case)
//Space complexity O(1);
//Assume count as 0 initially
//Take a map and intialise the mapping  with 0:1 to cover the corner case.
//Traverse from beginning to the end by calculating the running sum at every index.
//If the map has the rsum-k as key then increase the count as count+value at rsum-k key. 
//if the map has rsum then update the value at jey rsum as +1.
//else put(rsum,1);
//at last return the count value which gives the max no.of subarrays with sum K.




class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int rsum=0,count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];
            if(map.containsKey(rsum-k)){
                count=count+map.get(rsum-k);
            }
            if(!map.containsKey(rsum)){
                map.put(rsum,1);
            }
            else{
                map.put(rsum,map.get(rsum)+1);
            }
            
        }
        return count;
    }
}