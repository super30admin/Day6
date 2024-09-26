class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null){ 
            return 0;
            }
        int maxLen = 0;
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); //Edge condition
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                counter= counter - 1;
            }else{
                counter= counter + 1;
            }
            //We need to store hte max length, so the previous index must be known
            if(!map.containsKey(counter)){
                map.put(counter, i); //store startIdx
            }else{
                //Compare the new max by previous stored index and current index difference
                // i(current Index - previous index stored as part of counter key)
                maxLen = Math.max(maxLen, i-map.get(counter));
            }
            
        }
        return maxLen;
    }
}