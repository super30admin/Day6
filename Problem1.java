//Time Complexity: O(N)
//Space Complexity: O(N)
//We use a hashmap to check whether the running sum has happened and the number of occurances of the running sum
//We check if there is a sum x-k(target sum) in the hashmap. If yes, we increment the count of target subarray by the number 
//of the occurences of the running sum.

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0;
        int rSum = 0;
        
       for(int i = 0; i<nums.length; i++){
            rSum += nums[i];
            
            if(map.containsKey(rSum - k)){
                count += map.get(rSum - k);
            }
           map.put(rSum,map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
    
}