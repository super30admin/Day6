class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int sum1 = 0,count = 0;
        hmap.put(0,1);
        for(int i =0;i<nums.length;i++){
            sum1 = sum1 + nums[i];
            if(hmap.containsKey(sum1 - k))
                count += hmap.get(sum1 - k);
            hmap.put(sum1,hmap.getOrDefault(sum1,0)+1);
        }
        return count;
    }
}

//Time Complexity: O(n). The whole array is iterated only once.
