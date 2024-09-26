// Time Complexity :O(n) where n is length of input 
// Space Complexity :O(n) where n 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public int subarraySum(int[] nums, int k) {
      int count=0;
        int rsum=0;
        HashMap<Integer,Integer> mymap= new HashMap<>();
        mymap.put(0,1);
        // map of rsum-k and no. of times you see this difference
        for(int i=0; i<=nums.length-1;i++){
                rsum += nums[i]; 
            if(mymap.containsKey(rsum-k)){
                count = count+ mymap.get((rsum-k)) ;  
            }
            if(!mymap.containsKey(rsum))
            {
                mymap.put(rsum,0);
            }
              mymap.put(rsum,mymap.get(rsum)+1);
        }
        return count;  
    }
}