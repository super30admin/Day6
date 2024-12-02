// Time complexity: O(N)
// Space complexity: O(N)
// In this solution, finding sum-k will give us a valid sub array. put (0,1) means, whenever the sum becomes 0, the frequency will be increased by 1. If there exists a key that satisfies sum-k, it'll be fetched and  get added to the result. Finally the result will be returned. 
// This code was successfully executed and got accepted in leetcode.


class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> h1=new HashMap<Integer,Integer>(){{put(0,1);}};;    
        int sum=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(h1.containsKey(sum-k)){
                result += h1.get(sum-k);
            }
            h1.put(sum,h1.getOrDefault(sum,0)+1);
        }
        return result;
}
}