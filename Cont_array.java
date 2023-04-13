//  Brute force

class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
    for (int i = 0; i < nums.length; i++) {
        int zeros = 0;
        int ones = 0;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeros++;
            } else {
                ones++;
            }
            if (zeros == ones) {
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
    }
    return maxLength;
    }
}


// Improved

class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
    int diff = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    for (int i = 0; i < nums.length; i++) {
        diff += nums[i] == 1 ? 1 : -1;
        if (map.containsKey(diff)) {
            maxLength = Math.max(maxLength, i - map.get(diff));
        } else {
            map.put(diff, i);
        }
    }
    return maxLength;
    }
}
