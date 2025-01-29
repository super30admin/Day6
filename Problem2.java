//Time Complexity o(n)
//Space complexity o(n)

import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int rsum = 0;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                rsum--;
            }else{
                rsum++;
            }

            if(map.containsKey(rsum)){
                ans = Math.max(ans, i - map.get(rsum));
            }else{
                map.put(rsum,i);
            }
        }
        return ans;
    }
}