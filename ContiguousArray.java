import java.util.HashMap;

/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int runningSum = 0;
        int max = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                runningSum += 1;
            } else {
                runningSum -= 1;
            }
            if (hashMap.containsKey(runningSum)) {
                max = Math.max(max, hashMap.get(runningSum) - i);
            } else {
                hashMap.put(runningSum, i);
            }
        }
        return max;
    }
}
