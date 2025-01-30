// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int rSum = 0;
        int maxi = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                rSum += -1;
            }else{
                rSum += 1;
            }
            if(map.containsKey(rSum)){
                maxi = Math.max(i-map.get(rSum), maxi);
            }else{
                map.put(rSum, i);
            }
        }
        return maxi;
    }
}
