/*
Time Complexity - O(n)
Space Complexity - O(n)
*/

class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int rSum = 0;
        int length = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                rSum = rSum + 1;
            }
            else{
                rSum = rSum -1;
            }
            if(map.containsKey(rSum)){
                length = Math.max(length,i-map.get(rSum));
            }
            else{
                map.put(rSum,i);
            }
        }
        return length;
    }
}
