//time O(n)
//space O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 1) return 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for(int i= 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                int diff = i - map.get(sum);
                max = Math.max(max, diff);
            }
        }               
        return max;
    }
}
