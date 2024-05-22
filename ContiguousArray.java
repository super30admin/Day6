import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    //TC- O(n)
    //SC - O(n)
    public int findMaxLength(int[] nums) {

        //Using HashMap
        Map<Integer, Integer> hashmap = new HashMap<>();

        int maxLen =0, count =0;

        for(int i =0; i < nums.length; i++) {
            count += nums[i] == 1? 1 : -1;
            //Subarray from index 0 to i have equal 0s and 1s
            if(count == 0)
                maxLen = Math.max(maxLen, i+1);

            if(hashmap.containsKey(count))
                maxLen = Math.max(maxLen, i - hashmap.get(count));
            else
                hashmap.put(count, i);
        }

        return maxLen;

    }
}
