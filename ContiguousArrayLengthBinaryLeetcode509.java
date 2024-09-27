//Time Complexity O(N^2)
//Space Complexity O(1)
//Leetcode: Yes, but the brute force solutin timesout
import java.util.HashMap;
public class ContiguousArrayLengthBinaryLeetcode509 {
    public int findMaxLength(int[] nums) {
        int end = nums.length;
        int count = 0;
        int max_len = 0;

        for (int i = 0; i < end; i++) {
            count = 0;
            for (int j = i; j < end; j++) {
                if (nums[j] == 0) {
                    count++;
                } else {
                    count--;
                }
                if (count == 0) {
                    max_len = Math.max(max_len, j-i + 1);
                }
            }
        }
        return max_len;
    }

   //Time Complexity O(N)
    //Space Complexity O(N)
    //Leetcode : yes
    public int findMaxLength1(int[] nums) {
        int n = nums.length, max = 0;
        HashMap<Integer, Integer> index = new HashMap<>();
        index.put(0, -1);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) sum--;
            else sum++;

            if (index.containsKey(sum)) {
                max = Math.max(max, i - index.get(sum));
            } else {
                index.put(sum, i);
            }
        }
        return max;
    }
}
