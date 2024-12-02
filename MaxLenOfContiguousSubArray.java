import java.util.HashMap;

/**
 * Time complexity is O(n)
 * Space complexity is O(n)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 * https://leetcode.com/problems/contiguous-array/
 */
public class MaxLenOfContiguousSubArray {
    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{}));
        System.out.println(findMaxLength(new int[]{1, 0}));
        System.out.println(findMaxLength(new int[]{1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1}));
    }

    private static int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        map.put(count, -1);

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count = count - 1;
            }else{
                count = count + 1;
            }

            if(map.containsKey(count)){
                max = Math.max(max, i - map.get(count));
            }
            else {
                map.put(count, i);
            }
        }

        return max;
    }
}
