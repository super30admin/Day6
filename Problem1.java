//Time complexity: O(N)
//Space complexity : O(N)
//did this problem run on leetcode: yes
// any questions?: no
//https://leetcode.com/problems/subarray-sum-equals-k/
//560. Subarray Sum Equals K
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> smap = new HashMap<>();
        //for edge case whether 0has happened before or not
        smap.put(0,1);
        int count =0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            //to calculate running sum
            count += nums[i];
            //if hashmap contains the complimentary of current running sum and target that means we have a continous subarray so increment max value 
            if(smap.containsKey(count-k)){
                //we are adding get(count-k) becoz sometimes the complimentary may lie more than 1 time
                max += smap.get(count-k);
            }
            // if hashmap doesnt contain runnins sum then add that to hash map
            if(!smap.containsKey(count)){
                smap.put(count,1);
            }
            //if already rsum is der, then add 1 to the current exisiting value
            else{
                smap.put(count,smap.get(count)+1);
            }
        }
        return max;
    }
}