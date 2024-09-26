/*
Approach: Inorder to count all the subArrays with sum k, maintain a HashMap of all RunningSum at given index as key and 
          their occurance as value.
          Check for copmlement of running sum with k, if already in map get the value and increase the count by value and increase value by 1 
          Handle the edge case of putting key - 0 and value - 1, because first occurance's copmlement will always be 0
          
TC : O(n), SC: O(n)
*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            if(map.containsKey(rSum - k)){
                count += map.get(rSum - k);
            }
            map.put(rSum,map.getOrDefault(rSum,0)+1);    
        }
        return count;
    }
}