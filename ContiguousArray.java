import java.util.HashMap;

//TC: O(n)
//SC: O(n+1)
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) sum = sum + 1;
            else sum = sum - 1;
            if(!map.containsKey(sum)) {
                map.put(sum, i);

            } else {
                maxLen = Math.max(maxLen, i-map.get(sum));
            }
        }
        return maxLen;
    }
}
