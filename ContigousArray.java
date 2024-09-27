import java.util.HashMap;

public class ContigousArray {

    public int findMaxLength(int[] nums) {
        int count = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else
                count++;

            if (map.containsKey(count)) {

                int val = map.get(count);

                max = Math.max(max, i - val);

            } else {
                map.put(count, i);
            }

        }
        return max;

    }
}