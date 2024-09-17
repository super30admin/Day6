// 560 subarray Sum Equals K 
// Solved on Leetcode
// Time Complexity - O(n)
// Space Complexity - O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hashmap= new HashMap();
        int sum=0;
        int result=0;
        hashmap.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hashmap.containsKey(sum-k)){
                    result+=hashmap.get(sum-k);
            }
            if(hashmap.containsKey(sum)){
                hashmap.put(sum,hashmap.get(sum)+1);
            }else{
                hashmap.put(sum,1);
            }
        }
        return result;
    }
}