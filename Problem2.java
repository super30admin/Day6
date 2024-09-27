//Time Complexity: O(N)
//Space Complexity: O(N)
//To find out the longest contiguos array, we maintain a hashmap of the running sum of the given array.
//For each entry of the sum, we check if the same running sum has occured before.
//The difference between the indices of the same running sums gives us the length of the longest contiguous array.
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int max = 0;
        int rSum = 0;
        map.put(0,-1);
        
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                rSum -=1;
            }else{
                rSum += 1; 
            }
            if(map.containsKey(rSum)){
                max = Math.max(max,i - map.get(rSum));
            }else{
                map.put(rSum,i);
            }
        }
        return max;
    }
}