/*
Approach: running sum, add 1 to rsum at every occurence of 1, and substract 1 when 0

Time compelxity: O(n) running sum gives us O(n2) and using hashMap makes in O(n)
Space complexity: O(n)
*/

class Solution {
    public int findMaxLength(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }
        int rSum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // map since we need both index and rSum
        map.put(rSum, -1); // add -1 for [0,1] base case to work

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                rSum = rSum + 1;
            } 
            else {
                rSum = rSum - 1;
            }
            if(!map.containsKey(rSum)){
                map.put(rSum, i); // update the earliest entry, helps to find max length using array index
            } else {
                max = Math.max(max, i - map.get(rSum));
            }
        }
        return max;
    }
}