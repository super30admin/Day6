//Time Complexity: O(n)
//Space Complexity: O(n)
//Did it run on leetcode: Yes
//Problems faced any?: No

import java.util.HashMap;

class Problem16 {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i<nums.length; i++){
            int comp = 0;
            sum += nums[i];
            comp = sum - k;

            if(map.containsKey(comp))
                count += map.get(comp);

            if(map.containsKey(sum))
                map.put(sum, map.get(sum)+1);
            else
                map.put(sum, 1);
        }

        return count;
    }
}