//TimeComplexity - O(N) - N-length of nums
//SpaceComplexity - O(N) - N-length of nums - in worst case

class Solution {
  public int subarraySum(int[] nums, int k) {

    int result = 0, sum=0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0,1);

    for(int i=0; i<nums.length; i++){
      sum= sum+nums[i];

      if(map.containsKey(sum-k)){
        result += map.get(sum-k);
      }

      map.put(sum, map.getOrDefault(sum,0)+1);
    }

    return result;
  }
}
