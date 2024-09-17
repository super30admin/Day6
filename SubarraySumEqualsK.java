// Time Complexity :O(n) --> beacuse of for loop
// Space Complexity :O(n)  ---> because of Hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.HashMap;

// Your code here along with comments explaining your approach
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int result = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        for(int i = 0;i<nums.length;i++){
            sum+= nums[i];
            if(map.containsKey(sum-k))
                result += map.get(sum-k);
            if(!map.containsKey(sum))
                map.put(sum,1);
            else
                map.put(sum,map.get(sum)+1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,7,2,-3,1,4,2,0,1};
        System.out.println(subarraySum(nums,7));
    }
}
