// 525. Contiguous Array


class Solution {
    public int findMaxLength(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); 
        int rSum =0;
        int start = 0; int end = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            rSum = nums[i] == 0 ? rSum -1: rSum + 1;
            if(map.containsKey(rSum))
            {
                if(max < i - map.get(rSum))
                {
                    max = i - map.get(rSum);
                    end = i; start = map.get(rSum) + 1;
                }
            } else {
                map.put(rSum, i);
            }
        }
     return max;   
    }
}


/*

/**Complexity Analysis**
Time complexity : 
O(n). The entire array is traversed only once.

Space complexity : 
O(n). Maximum size of the HashMap map will be n, if all the elements are either 1 or 0.
*/