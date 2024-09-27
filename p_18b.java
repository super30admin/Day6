import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>(); //<RSum , Index>
        int max = 0;
        int rSum = 0;
        int start = 0; int end = -1;
        map.put(0, -1);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0)
            {
                rSum = rSum - 1;
            }else{
                rSum = rSum + 1;
            }
            if(map.containsKey(rSum)){
                //max = Math.max(max, i - map.get(rSum));
                if(max < i - map.get(rSum)){
                    max = i - map.get(rSum);
                    start = map.get(rSum) + 1 ;
                    end = i;
                }
            }else{
                map.put(rSum, i);
            }
        }
        return max;
    }
}