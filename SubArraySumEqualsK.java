import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    //TC - O(n)
    //SC - O(n)
    public int subarraySum(int[] nums, int k) {

        //Using hashMap
        Map<Integer, Integer> hashMap = new HashMap<>();
        int sum=0, count =0;

        hashMap.put(0, 1);

        for(int num : nums) {
            sum += num;

            if(hashMap.containsKey(sum-k)) {
                count += hashMap.get(sum-k);
            }

            hashMap.put(sum, hashMap.getOrDefault(sum, 0) +1);
        }

        return count;

    }
}
