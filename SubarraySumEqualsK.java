import java.util.HashMap;
import java.util.Map;

//time - O(n)
//space - O(n)
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0) return 0;
        int count = 0, rsum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(rsum,1);
        for(int i=0; i<nums.length; i++){
            rsum = rsum + nums[i];
            if(map.containsKey(rsum - k)){
                count = count + map.get(rsum - k);
            }
            map.put(rsum, map.getOrDefault(rsum, 0)+1);
        }

        return count;
    }
}
