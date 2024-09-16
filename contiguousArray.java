//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public int findMaxLength(int[] nums) {


        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int max = 0;
        int currentSum = 0;
        hashmap.put(0 ,-1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) currentSum += 1;
            else currentSum -= 1;

            if(hashmap.containsKey(currentSum)){
                int end = i;
                int start = hashmap.get(currentSum);
                max = Math.max(max, end - start);

            }
            else{
                hashmap.put(currentSum, i);

            }
        }return max;


    }
}