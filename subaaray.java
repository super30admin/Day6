// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        int rsum =0;
        int counter=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            
            rsum = rsum + nums[i];
            
            int diff=rsum-k;
            
            if(map.containsKey(diff)){
                counter=counter+map.get(diff);
                
            }
            if(!map.containsKey(rsum)){
                map.put(rsum,1);
            }else{
               map.put(rsum,map.get(rsum)+1); 
            }
        }
    return counter;
    }
}
