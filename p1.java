// TC - O(n)
// SC - O(n)

// Hint: Calculate the prefix sum array and use a map. (Build up on this)

class Solution {
  public int subarraySum(int[] nums, int k) {
    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];
    for(int i=1; i<nums.length; i++) {
      prefixSum[i] = nums[i] + prefixSum[i-1];
    }
    int ctr = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0,1);

    for(int i=0; i<nums.length; i++) {
      if(  map.containsKey(prefixSum[i] - k)) {
        ctr = ctr + map.getOrDefault(prefixSum[i] - k, 0);
        System.out.println((prefixSum[i]));
      }

      if(!map.containsKey(prefixSum[i])) {
        map.put(prefixSum[i], 1);
      }
      else {
        int val = map.get(prefixSum[i]);
        map.put(prefixSum[i], val+1);
      }
    }

    return ctr;

  }
}