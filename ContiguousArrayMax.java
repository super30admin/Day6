//Amazon Interview Question
//Time Complexity = O(n)
//Space Complexity =O(n)
//Balanced or Equal number of 1's and 0's is called contiguous Array
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int rsum = 0;//rsum is running sum can go rsum in negative as well
        //Store the value in rsum and update the max value 
        int max = 0;
        map.put(0,-1); //[0,1,0,1]
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                rsum++;//if rsum =1 then increment to 1
            }
            else {
                //rsum =0 then decrement to 0
                rsum--;
            }
            if(map.containsKey(rsum)){
                max = Math.max(max,i-map.get(rsum));
            }
            else{
                map.put(rsum,i);
            }
        }
        return max;
        
    }
}