import java.util.HashMap;

/**
 * Time complexity is O(n)
 * Space complexity is O(n)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
public class SubArraySumEqualsKHashMap {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {1}, 1));
        System.out.println(subarraySum(new int[] {1,1,1}, 2));
        System.out.println(subarraySum(new int[] {3,  4,  7,  2,  -3,  1,  4,  2,  0,  1}, 7));
    }

    private static int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int rSum = 0;
        int count = 0;

        for(int i =0 ; i< nums.length; i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)){
                count = count + map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum,0)+1);
        }
        return count;
    }
}
