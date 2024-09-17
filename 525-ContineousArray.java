//Approach: Using a HashMap
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(N)
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); //Inserting a dummy node
        int rSum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            rSum = rSum + (nums[i] == 0 ? -1 : 1 );
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }else{
                map.put(rSum, i);
            }
        }
        
        return max;
    }
}