/*
*Time complexity: O(n)
*Space Complexity: O(n)
*Accepted on leetcode
*/
class Solution {
    public int findMaxLength(int[] nums) {
        int length = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count--;
            }
            if(map.containsKey(count)){
                length = Math.max(length, i-map.get(count));
            }
            else{
                map.put(count,i);
            }
        }
        return length;
    
    }
}