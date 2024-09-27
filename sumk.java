class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        int rsum = 0;
        map.put(rsum,1);
        
        for (int i = 0 ; i<nums.length ; i++ ){
            rsum = rsum + nums[i];
            if(map.containsKey(rsum-k)){
                count = count + map.get(rsum-k);
            }
            if(map.containsKey(rsum)){
                map.put(rsum,map.get(rsum)+1);
            }
            else{
                map.put(rsum,1);
            }
        }
        return count;
    }
    }