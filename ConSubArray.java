import java.util.HashMap;

public class ConSubArray {

    public int findMaxLength(int[] nums) {
        int max = 0;

        HashMap<Integer, Integer> hs = new HashMap<>();

        int count = 0;
        hs.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
            else
                count--;

            if (hs.containsKey(count)) {
                int temp = i - hs.get(count);
                if (temp > max)
                    max = temp;
            } else {
                hs.put(count, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ConSubArray ca = new ConSubArray();
        int[] arr = { 0, 1, 0 };
        int[] arr1 = { 1, 0 };
        System.out.println(ca.findMaxLength(arr));
    }
}
