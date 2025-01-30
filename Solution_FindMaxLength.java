import java.util.HashMap;

//TC: O(n)
//SC: O(n)
//Did the code run on leetcode: Yes
public class Solution_FindMaxLength {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int count = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                count--;
            else
                count++;

            if(hmap.containsKey(count))
                max = Math.max(max, i - hmap.get(count));
            else{
                hmap.put(count, i);
            }
        }
        return max;
    }
}
