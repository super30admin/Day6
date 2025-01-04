import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n), iteration over nums length is carried.
// Space Complexity: O(n) as HashMap is used to store the occurences.

// Used Mapped Running Sum to check for its previous occurences. 
// and subtract the current - firstIndex should give the max.
//Max needs to be updated everytime if condition is met
public class ContiguousArray {

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[] { 0, 1 })); // 2
        System.out.println(findMaxLength(new int[] { 0, 1, 0 })); // 2
    }

    public static int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int rSum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] == 0)
                rSum -= 1;
            else if (nums[currentIndex] == 1)
                rSum += 1;
            if (map.containsKey(rSum)) {
                max = Math.max(max, currentIndex - map.get(rSum));
            } else {
                map.put(rSum, currentIndex);
            }
        }
        return max;

    }

}