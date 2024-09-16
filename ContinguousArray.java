class Solution {
  public int findMaxLength(int[] nums) {
    if(nums.length == 0)
      return 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    int sum=0,max=0;
    map.put(0,-1);
    for(int i=0;i< nums.length;i++){
      if(nums[i] == 0)
        sum -= 1;
      else
        sum += 1;
      if(map.containsKey(sum)){
        int curr = i-map.get(sum);
        max= Math.max(max,curr);
      }
      else{
        map.put(sum,i);
      }
    }
    return max;
  }
}