// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public int findMaxLength(int[] nums) {
       int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        int len =0;
        
        //to detect the initial balance sub array
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else {
                count--;
            }
            
            if(map.containsKey(count)){
                len = i - map.get(count);
                max = Math.max(max,len);
            }
            else{
                map.put(count, i);
            }
        }
        
        return max;
    }
}