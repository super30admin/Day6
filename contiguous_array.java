//Using Running Sum(RSum) and HashMap

class Solution {
    public int findMaxLength(int[] nums) {
         if(nums == null || nums.length == 0)
             return 0;
        
        //Hashmap (rSum, index) as (key, value)
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  //Imp : put for handling edge cases
        int rsum = 0;
        int max = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1)
                rsum ++;
            else
                rsum --;
            
            if(map.containsKey(rsum))
                max = Math.max(max, i - map.get(rsum));
            else
                map.put(rsum, i);
        }
        return max;
    }
}

//Time Complexity :O(n)
//Space Complexity :O(n)