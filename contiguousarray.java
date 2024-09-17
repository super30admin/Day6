// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no



// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int rsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                rsum++;
            }else{
                rsum--;
            }
            
            if(!map.containsKey(rsum)){
                map.put(rsum,i);
            }else{
                max=Math.max(max,(i-(map.get(rsum))));
            }
        }
        
        return max;
    }
}


