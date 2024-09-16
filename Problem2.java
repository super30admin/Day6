//Time Complexity O(n) where n is the number of elements in the array
//Space Complexity O(n)  where n is the number of elements in the array
//This Solution worked on Leetcode

//We are using a HashMap <Integer, Integer> where first integer is the running sum and the second integer is the index at which the sum first appeared since we are looking for maximum length. So, we will traverse through the array and as we find 0 we will decrement the running sum and if we find 1 we will increment the running sum. We will put in the running sum and the index at which it was found first in the HashMap. If the running sum appears again in the traversal it means the number of 1s and 0s are same between this index and the index at which the same sum appreared first, which would be calculated in the length variable. So, length will be the return value which will hold the maximum length.

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length <=1) return 0;
        int max =0;
        int runSum =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                runSum--;
            }
            else{
                runSum++;
            }
            if(map.containsKey(runSum)){
                max = Math.max(max,i-map.get(runSum));
            }
            else{
                map.put(runSum,i);
            }
        }
        return max;
    }
}
