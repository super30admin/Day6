import java.util.HashMap;

// Time Complexity : O(n) Where n is the number of elements in the array
// Space Complexity : O(n) to hold the count
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem2 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLength = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            count = count + (nums[i] == 1 ? 1:-1);
            if(map.containsKey(count)){
                maxLength = Math.max(maxLength, i-map.get(count));
            } else {
                map.put(count, i);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0};
        Problem2 obj = new Problem2();
        System.out.println(obj.findMaxLength(arr));
    }

}
