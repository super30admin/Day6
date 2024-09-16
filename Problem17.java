//Time Complexity: O(n)
//Space Complexity: O(n)
//Did it run on leetcode: Yes
//Problems faced any?: No

import java.util.HashMap;

class Problem17 {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                sum += 1;
            else
                sum += -1;

            if(sum==0)
                maxLen = Math.max(maxLen, i+1);

            if(!map.containsKey(sum))
                map.put(sum, i);
            else
                maxLen = Math.max(maxLen, i-map.get(sum));
        }

        return maxLen;
    }
}