import java.util.HashMap;
/**
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * Ran on leetcode?: Yes
 * Any problems faced?: No
 */
public class ContiguousArray {
    /**
     * Utilizing the running sum method where for every zero seen the
     * rsum is reduced by 1 and for every 1 seen increased by 1
     * The index and rsum are maintained in hashmap such that the farthest index can be lookedup
     */
    public int findMaxLength(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int max = 0;
        int rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            rSum -= nums[i] == 0 ? 1 : -1;

            if (map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ContiguousArray obj = new ContiguousArray();
        int[] arr = {0,1,1,1,0,0,0,0,1,1,0};
        int maxLength = obj.findMaxLength(arr);
        System.out.println("Max length: " + maxLength);
        assert (maxLength == 10);
    }
}
