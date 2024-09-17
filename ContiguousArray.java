//Time Complexity: O(N);
//Space Complexity: 0(N);
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>(); // store sum and index of first occurance of sum
        map.put(0,-1); // to get the correct length
        int sum = 0;
        int maxLength = 0;
        for(int i = 0 ;i<nums.length;i++) {
            if(nums[i]==0) {
                sum = sum + -1; // refer 0 as -1;
            } else {
                sum = sum + 1;
            }
            if(map.containsKey(sum)) {
                maxLength = Math.max(i-map.get(sum),maxLength);
            } else {
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}