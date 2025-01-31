// Time complexity of O(n)
// Looping through array once to calculate running sum 
// Using freq map to see if a sum has occured before

class Solution {
    public int findMaxLength(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int result = 0;
        HashMap<Integer, Integer> frequencyMap = 
        new HashMap<Integer, Integer>();
        frequencyMap.put(0,-1);
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
               sum = sum + 1;
            } 
            else{
                sum = sum - 1;
   
            }
            if(!frequencyMap.containsKey(sum)){
              frequencyMap.put(sum,i); //2,0 3,1 1,2
            }
         else{
               result = Math.max(result, i - frequencyMap.get(sum));//2
         }
        

        }

return result;
    }
}