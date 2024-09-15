 /* 
 ** Time Complexity:  O(n)
 ** Space Complexity: O(n)
 */

 class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum=0; int result=0;
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            
            rSum = (nums[i] == 0) ? rSum - 1 : rSum + 1;
            
            if(!map.containsKey(rSum)){
                map.put(rSum, i);
            }else{
                int temp = i - map.get(rSum);
                if(result < temp){
                    result = temp;
                }
            }
        }
        return result;
    }
}