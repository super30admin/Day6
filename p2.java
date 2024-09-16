// TC: O(n)
// SC: O(n)

// Approach: Replace 1 with -1 and then the sub array sum should be 0. (Build up on this)

class Solution {
  public int findMaxLength(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int[] pre = new int[nums.length];
    pre[0] = nums[0] == 0 ? -1 : 1;
    for(int i=1; i<nums.length; i++) {
      if(nums[i] == 0)
        nums[i] = -1;
      pre[i] = pre[i-1] + nums[i];
    }

    int res = 0;
    for(int i=0; i<nums.length; i++) {
      if(map.containsKey(pre[i])) {
        int ans = i - map.get(pre[i]);
        if(ans > res)
          res = ans;
      }
      else {
        map.put(pre[i], i);
      }
    }
    return res;
  }
}