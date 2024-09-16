//Facebook Interview question
//Time Complexity = O(n);
//Space Complexity =O(n);
//In Hashmap using key as rsum and value = count for storing and for calculating subarray sum equal to k incrementing the count if repeated value in rsum
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int rsum = 0;
        int count =0;
        //rsum = current index value + past index value ex rsum+nums[i]
        map.put(rsum,1);
        //checking from 0 to last index value 
        for(int i=0; i<nums.length;i++){
            //if rsum+current index value
            rsum = rsum+nums[i];
            //If rsum contains in hashmap then rsum-K or count + stored rsum value in hashmap
            if(map.containsKey(rsum - k)){
                count = count + map.get(rsum - k);
            }
            //if rsum is zero increment default by 1
            map.put(rsum,map.getOrDefault(rsum,0) +1);
            //---map.put(rsum,map.getOrDefault(rsum,0) +1); instead of this statement can be written as 
            //if(map.containsKey(rSum)){
        //     map.pu(rsum, map.get(rsum)+1);}
        // else{
        //     map.put(rsum,1)
        // }
        //}
        }
        return count;
    }
}