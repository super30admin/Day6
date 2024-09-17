// Time: O(n)
//Space : O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
     if(nums == null){
       return 0;
     } 
      
      HashMap<Integer,Integer> hmap = new HashMap<>();
      //coldstart 
      hmap.put(0,1);
      
      int currSum = 0;
      int complement = 0;
      int count = 0;
      
      // Calculate current sum till the every index
      // find the complement currentSum-k to find in the hashmap
      // if hash map contains complement, that means the subarrray exsits such that sum = k
      //    increment the count
      //else, put the current sum intot he hashmap, for future reference 
      // return count
      for(int i=0;i<nums.length;i++){
        currSum += nums[i];
        complement = currSum - k;
        if(hmap.containsKey(complement)){
          count += hmap.get(complement);
        }
        // else if(hmap.containsKey(currSum)){
          hmap.put(currSum, hmap.getOrDefault(currSum,0)+1);
        // }
      }
      
      return count;
      
    }
}
