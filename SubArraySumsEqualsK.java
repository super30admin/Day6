// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public int subarraySum(int[] nums, int k) {
    if(nums == null || nums.length == 0) return 0;
  
  HashMap<Integer,Integer> map = new HashMap<>();// map<rSum,count>
  int totalSubArrays=0;
  int rSum=0;
  map.put(0,1); // for edge cases like where k-nums[i] will be 0.
  
  for(int i=0;i<nums.length;i++){ // iterating thru the array
      rSum += nums[i]; // always increasing the running sum
      if(map.containsKey(rSum -k)){ // if the map contains difference of k and current running sum
          totalSubArrays += map.get(rSum-k); //then increase the total number of subarray by count
      }
      
      map.put(rSum,map.getOrDefault(rSum,0) +1); // to increase the count of each running sum by 1 or if not present initializing it at 1
  }
  
  return totalSubArrays;
}