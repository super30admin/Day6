/*
Time-Complexity - O(n)
Space-COmplexity - O(n)
*/  
class Solution {
    public int findMaxLength(int[] nums) {
      Map<Integer,Integer> map = new HashMap<>();
      int sum = 0;
      int max = 0;
      map.put(0,-1);
      for(int i=0;i<nums.length;i++){
          if(nums[i] == 1){
              sum++;
          }else{
              sum--;
          }
          if(map.containsKey(sum)){
              max = Math.max(max,i-map.get(sum));
          }else{
              map.put(sum,i);
          }
      }
      return max;

    }
}