class Solution{
public int findMaxLength(int[] nums) {
    int n = nums.length, max = 0;
    Map<Integer, Integer> index = new HashMap<>();
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
