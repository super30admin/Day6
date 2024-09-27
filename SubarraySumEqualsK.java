import java.util.HashMap;

/*
Time Complexity: O(n)
Space Complexity: O(n)
Worked on Leetcode: Yes
Any difficulties: No

Approach
Attended after class
 */
public class SubarraySumEqualsK {
    public static int subArraySumEqualsK(int[] nums, int k){
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i = 0; i<nums.length; i++){
            sum+= nums[i];
            if(map.containsKey(sum-k)){
                count+= map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1};
        System.out.println("subArraySumEqualsK: "+ subArraySumEqualsK(nums, 2));
    }
}
