//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public int findMaxLength(int[] nums) {
        
        //using the check sum concept where we know the value of z = x - y and checksum is checked at each index which makes this algorithms to work in single pass.
        
        HashMap<Integer,Integer> map1 = new HashMap<>();
        
        int checksum = 0;
        int result = 0;
        
        map1.put(0,-1);
        
        
        for(int i = 0; i < nums.length; i ++){
            
            if(nums[i] == 1){
                
                checksum = checksum + 1;
            }
            
            else{
                
                checksum = checksum - 1;
            }
            
            if(!map1.containsKey(checksum)){
                
                map1.put(checksum,i);
            }
            
            else{
                
             int temp =   map1.get(checksum);
                result = Integer.max(result,i - temp);
            }
        }
     //   System.out.print(map1);
        return result;
    }
}