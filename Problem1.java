//https://leetcode.com/problems/subarray-sum-equals-k/submissions/

//Time complexity : O(N)
//Space complexity : O(N)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;
        for(int num : nums){
            sum += num;
            int compliment = sum-k;
            if(map.containsKey(compliment)){
                count += map.get(compliment);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}