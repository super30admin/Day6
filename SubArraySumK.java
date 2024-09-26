import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
public class SubArraySumK {
  public static int SubArrSum(int[] nums, int k) {
    int count = 0, sum = 0;
    HashMap<Integer, Integer> hmap = new HashMap<>();
    hmap.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (hmap.containsKey(sum - k))
        count += hmap.get(sum - k);
      hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    int k = 3;
    System.out.println(SubArrSum(arr, k));
  }
}
