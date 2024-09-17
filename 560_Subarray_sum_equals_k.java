class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int count =0;
        int rsum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int diff = 0;
        
        for(int i = 0; i<nums.length; i++){
            rsum = rsum + nums[i];
            diff = rsum - k;
            
             if(map.containsKey(diff)){
                count = count + map.get(diff);
                
            }
            if(map.containsKey(rsum)){
                map.put(rsum, map.get(rsum)+1);
            }
            else{
                map.put(rsum, 1);
            }
        }
        return count;
    }
}

//TC => O(n)
//SC => O(n)
