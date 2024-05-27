import java.util.HashMap;

public class SubArraySumK {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int result = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            if(map.containsKey(rSum - k)){
                result += map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return result;
    }
    public int subarraySum2(int[] nums, int k) {

        int result = 0;
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        for(int i = 1; i <= nums.length; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        for(int start = 0; start < prefixSum.length; start++){
            for(int end = start + 1; end < prefixSum.length; end++){
                if(prefixSum[end] - prefixSum[start] == k){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] strs){
        SubArraySumK object = new SubArraySumK();
        System.out.println(object.subarraySum(new int[]{1,1,1}, 2));
    }
}
