//Using Running Sum & HashMap

class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        
        //HashMap(rsum, count)
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int rsum = 0;
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            rsum = rsum + nums[i];
            if(map.containsKey(rsum - k))
                count = count + map.get(rsum - k);
            
            //map.put(rsum, map.getOrDefault(rsum, 0) + 1);  alternative for below lines
            if(map.containsKey(rsum))
                map.put(rsum, map.get(rsum) + 1);
            if(!map.containsKey(rsum))
                map.put(rsum, 1);
        }
        return count;
    }
}

//Time Complexity : O(n)
//Space Complexity :O(n)