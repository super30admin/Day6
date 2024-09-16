// TC: O(n)
// SC: O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int rsum=0;
        int max=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                rsum++;
            }
            else{
                rsum--;
            }
            if(map.containsKey(rsum)){
                max=Math.max(max, i-map.get(rsum));
            }
            else{
                map.put(rsum,i);
            }
        }
        return max;
    }
}