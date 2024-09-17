import java.util.HashMap;
/**
 * Time Complexity : O(N)
 * Space Complexity: O(N)
 */

public class SubarraySumEquals {
    public int subarraySum(int[] nums, int k) {
        int runSum = 0; int counter = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(runSum,1);

        for(int i = 0; i < nums.length; i++){
            runSum = runSum + nums[i];

            if(hashMap.containsKey(runSum - k)){
                counter = counter +  hashMap.get(runSum - k);
            }

            hashMap.put(runSum , hashMap.getOrDefault(runSum, 0) + 1);
        }
        return counter;
    }
}
