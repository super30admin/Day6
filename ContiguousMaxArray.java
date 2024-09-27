/*
Time Complexity: O(n)
Space Complexity: O(n)
Worked on Leetcode: Yes
Any difficulties: No

Approach:
attempted after the class
 */

import java.util.HashMap;

public class ContiguousMaxArray {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0, count = 0;
        for(int i = 0;i < nums.length;i++) {
            count += (nums[i] == 1)?1:-1;
            // if nums array from index 0 to i contains equal number of 0's and 1's
            if(count == 0)
                maxlen = Math.max(maxlen, i+1);
            if(map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else
                map.put(count, i);
        }
        return maxlen;
    }
    public static void main(String[] args){
        int []arr = {0,1,0};
        System.out.println(findMaxLength(arr));
    }
}


