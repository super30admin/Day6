// T and S :O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        //change all 0 to be -1
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int sum = 0, result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
		
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                int firstIndex = map.get(sum);
                result = Math.max(result, i - firstIndex);
            }
        }
        return result;
    }
}
