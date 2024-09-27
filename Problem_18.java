// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//I used running sum technique 

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                rSum=rSum-1;
            }else if(nums[i]==1){
                rSum=rSum+1; 
            }
            if(map.containsKey(rSum)){
                max = Math.max(i-map.get(rSum), max);
            }else{map.put(rSum,i);}
        }return max;
    }
}