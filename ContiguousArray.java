class Solution {
    public int findMaxLength(int[] nums) {
        // null check
        if (nums == null || nums.length == 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int rSum = 0;
        int max = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum--;
            } else {
                rSum++;
            }

            if (map.containsKey(rSum)) {
                int currLen = i - map.get(rSum);
                if (currLen > max) {
                    end = i;
                    start = map.get(rSum) + 1;
                    max = Math.max(max, currLen);
                }

            } else {
                map.put(rSum, i);
            }
        }

        return max;
    }
}

// Brute Force O(n2)

// class Solution {
// public int findMaxLength(int[] nums) {
// //null check

// int maxlen =0;
// for(int start=0;start<nums.length;start++){
// int zeroes=0;
// int ones=0;
// for(int end=start;end<nums.length;end++){

// if(nums[end] == 0){
// zeroes++;
// }
// else{
// ones++;
// }

// if(zeroes==ones) maxlen = Math.max(maxlen,end-start+1);

// }
// }
// return maxlen;
// }
// }