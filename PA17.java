//Leetcode 525. Contiguous Array 
//Time complexity : O(n) // n is length of nums array
//Space Complexity : O(n) // / n is length of nums array

class Solution {
    public int findMaxLength(int[] nums) {
       int ones=0;
        int count=0;
        if(nums==null || nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones=ones+1;
            }
            else{
                ones=ones-1;
            }
            if(hm.containsKey(ones)){
                 temp=i-hm.get(ones);
                if(temp>count){
                    count=temp;
                }
            }
            else{
                hm.put(ones,i);
            }
            
           
        }
        return count;
    }
}