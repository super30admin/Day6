// Time Complexity : O(n) traverse given array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES

import java.util.HashMap;

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        int rsum = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
            rsum-=1;   //decrement running sum if 0 is encountered
            }
            else{
                rsum+=1; //increment running sum if 1 is encountered
            }
             if(!map.containsKey(rsum)){
                map.put(rsum,i);
            }
            else{
                int sum = i-map.get(rsum);
                if(sum>max){
                max=sum;   //update max
                }
            }
        }
        
        return max;
        
        
        
    }
}