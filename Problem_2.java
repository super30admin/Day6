import java.util.HashMap;

//Time Complexity : O(n) where n = size of array
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes

public class Problem_2 {
	
	public int findMaxLength(int[] nums) {
        Integer[] sumArray = new Integer[nums.length];
        int sum = 0 ;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) sum++;
            else sum--;
            if(map.containsKey(sum)){
                int max = i - map.get(sum);
                maxLen = Math.max(max, maxLen);
            }else{
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
