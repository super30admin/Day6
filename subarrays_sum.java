//TC - O(n) to find the rsum
//SC - O(n) storing the rsum
// Leetcode succesful

// Description: iterating through the array and finding the running sum and storing them in the map and updating it if multiple times occur
//checking if the (rsum - key value) present in the map, if present adding that vale to the count  
class Solution {
    public int subarraySum(int[] nums, int k) {
        int rsum=0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);  // for initial subarray
        for(int i=0;i<nums.length;i++){
            rsum =rsum+nums[i];
            int value = rsum-k;
            if(map.containsKey(value)){
                count = count+map.get(value);
            }
            if(!map.containsKey(rsum))
            { map.put(rsum,1);
             
            }
            else
            {map.put(rsum,map.get(rsum)+1);
           
            }
        }
        return count;
    }
}