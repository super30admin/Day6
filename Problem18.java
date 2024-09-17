import java.util.HashMap;

/**
 * 
 * https://leetcode.com/problems/contiguous-array/
 * Github readme Problem2
 * 
 * time complexity: O(n)
 * space complexity: O(n)
 */
public class Problem18 {
    public int findMaxLength(int[] nums) {
        // store { runningSum : index } in map
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int runningSum = 0;
        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                runningSum--;
            } else {
                runningSum++;
            }
            if(map.containsKey(runningSum)){
                int rsAtIndex = map.get(runningSum);
                int probableMax = i - rsAtIndex;
                max = Math.max(max, probableMax);
            } else {
                map.put(runningSum, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
    }
}
