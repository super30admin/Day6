import java.util.HashMap;

//TC: O(n)
//SC: O(n)
//Did the code run on leetcode: Yes
public class Solution_SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(hmap.containsKey(sum - k))
                count += hmap.get(sum - k);
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
