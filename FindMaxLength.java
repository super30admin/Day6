// Time Complexity :O(n) where n is length of input 
// Space Complexity :O(n) where n can be continous no of 1/0.
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int findMaxLength(int[] nums) {
        int count=0;
        int rsum=0;
        HashMap<Integer,Integer> mymap= new HashMap<>();// map of rsum and index
        mymap.put(0,-1);
        for(int i=0; i<=nums.length-1;i++){
            if(nums[i]==0){
                rsum --;
            }else{
                rsum++;
            }
            if(mymap.containsKey(rsum)){
                count= Math.max(count,i-mymap.get(rsum) );
            }else{
                mymap.put(rsum,i);
            }
        }
        return count;
    }
}